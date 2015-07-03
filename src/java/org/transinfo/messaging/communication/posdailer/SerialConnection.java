
package org.transinfo.messaging.communication.posdailer;

import gnu.io.*;
import java.io.*;
import java.awt.TextArea;
import java.awt.event.*;
import java.util.TooManyListenersException;

import org.jpos.iso.ISOField;
import org.jpos.iso.*;
import org.jpos.iso.packager.GenericPackager;

/**
A class that handles the details of a serial connection. Reads from one
TextArea and writes to a second TextArea.
Holds the state of the connection.
*/

public class SerialConnection implements SerialPortEventListener,
					 CommPortOwnershipListener
{
    private static final org.apache.log4j.Logger ezlink = org.apache.log4j.Logger.getLogger(SerialConnection.class);

    private SerialManager parent;
    private SerialParameters parameters;
    private OutputStream os;
    private InputStream is;

    private CommPortIdentifier portId;
    private SerialPort sPort;
    private boolean open;
    private String inputdata =null;
    boolean dataRec =false;
    DataHandler dataHandler = null;

    /**
    Creates a SerialConnection object and initilizes variables passed in
    as params.
    @param parent A SerialDemo object.
    @param parameters A SerialParameters object.
    */

    public SerialConnection(SerialManager parent,SerialParameters parameters)
    {
	 	this.parent = parent;
	 	this.parameters = parameters;
	 	open = false;
	 	dataHandler = new DataHandler();
    }

   /**
   Attempts to open a serial connection and streams using the parameters
   in the SerialParameters object. If it is unsuccesfull at any step it
   returns the port to a closed state, throws a
   <code>SerialConnectionException</code>, and returns.

   Gives a timeout of 30 seconds on the portOpen to allow other applications
   to reliquish the port if have it open and no longer need it.
   */

   public void openConnection() throws SerialConnectionException
   {

	// Obtain a CommPortIdentifier object for the port you want to open.
	try
	{
            ezlink.info("openConnection Request received in " + SerialConnection.class.getName());
            ezlink.info("PortName= :  "+parameters.getPortName());
		System.out.println("PortName="+parameters.getPortName());
	     portId =
		 CommPortIdentifier.getPortIdentifier(parameters.getPortName());
	} catch (NoSuchPortException e) {
            ezlink.error(new Object(), e);
	    throw new SerialConnectionException(e.getMessage());
	}

	// Open the port represented by the CommPortIdentifier object. Give
	// the open call a relatively long timeout of 30 seconds to allow
	// a different application to reliquish the port if the user
	// wants to.
	try {
		System.out.println("Owner="+portId.getCurrentOwner());
                ezlink.info("Owner= :  "+portId.getCurrentOwner());
	    sPort = (SerialPort)portId.open(parameters.getPortName(), 3000);
            ezlink.info("connection opened!!  ");
	    System.out.println("connection opened");
	} catch (Exception e) {
            ezlink.error(new Object(), e);
	    throw new SerialConnectionException(e.getMessage());
	}

	// Set the parameters of the connection. If they won't set, close the
	// port before throwing an exception.
	try {
	    setConnectionParameters();
	} catch (SerialConnectionException e) {
            ezlink.info("setConnectionParameters():  ");
            ezlink.error(new Object(), e);
	    sPort.close();
	    throw e;
	}

	// Open the input and output streams for the connection. If they won't
	// open, close the port before throwing an exception.
	try {
		System.out.println("Before Streams");
                 ezlink.info("Before Streams:  ");
	    os = sPort.getOutputStream();
	    is = sPort.getInputStream();
	} catch (IOException e) {
            System.out.println("openConnection : IOException : sPort.getOutputStream()");
            e.printStackTrace();
            ezlink.info("Streams():  ");
            ezlink.error(new Object(), e);
	    sPort.close();
	    throw new SerialConnectionException("Error opening i/o streams");
	}

	// Add this object as an event listener for the serial port.
	try {
	    sPort.addEventListener(this);
	} catch (TooManyListenersException e) {
            System.out.println("openConnection : TooManyListenersException : sPort.addEventListener(this)");
            e.printStackTrace();
            ezlink.info("addEventListener():  ");
             ezlink.error(new Object(), e);
	    sPort.close();
	    throw new SerialConnectionException("too many listeners added");
	}

	// Set notifyOnDataAvailable to true to allow event driven input.
	sPort.notifyOnDataAvailable(true);

	// Set notifyOnBreakInterrup to allow event driven break handling.
	sPort.notifyOnBreakInterrupt(true);

	// Set receive timeout to allow breaking out of polling loop during
	// input handling.
	try {
	    sPort.enableReceiveTimeout(30);
	} catch (UnsupportedCommOperationException e) {
            System.out.println("openConnection : UnsupportedCommOperationException :  sPort.enableReceiveTimeout(30)");
            e.printStackTrace();
             ezlink.info("UnsupportedCommOperationException():  ");
            ezlink.error(new Object(), e);
	}

	// Add ownership listener to allow ownership event handling.
	portId.addPortOwnershipListener(this);
	open = true;


    }

    /**
    Sets the connection parameters to the setting in the parameters object.
    If set fails return the parameters object to origional settings and
    throw exception.
    */

    public void setConnectionParameters() throws SerialConnectionException {

	// Save state of parameters before trying a set.
	int oldBaudRate = sPort.getBaudRate();
	int oldDatabits = sPort.getDataBits();
	int oldStopbits = sPort.getStopBits();
	int oldParity   = sPort.getParity();
	int oldFlowControl = sPort.getFlowControlMode();

	// Set connection parameters, if set fails return parameters object
	// to original state.
	try {
            ezlink.info("setConnectionParameters() received in " + SerialConnection.class.getName());
	    sPort.setSerialPortParams(parameters.getBaudRate(),
				      parameters.getDatabits(),
				      parameters.getStopbits(),
				      parameters.getParity());
	} catch (UnsupportedCommOperationException e) {
	    parameters.setBaudRate(oldBaudRate);
	    parameters.setDatabits(oldDatabits);
	    parameters.setStopbits(oldStopbits);
	    parameters.setParity(oldParity);
            ezlink.info("Unsupported parameterException():  ");
            ezlink.error(new Object(), e);
	    throw new SerialConnectionException("Unsupported parameter");
           
	}

	// Set flow control.
	try {
	    sPort.setFlowControlMode(parameters.getFlowControlIn()
			           | parameters.getFlowControlOut());
	} catch (UnsupportedCommOperationException e) {
            ezlink.info("Unsupported flow control Exception():  ");
            ezlink.error(new Object(), e);
	    throw new SerialConnectionException("Unsupported flow control");
	}
    }

    /**
    Close the port and clean up associated elements.
    */
    public void closeConnection() {
	// If port is alread closed just return.
	if (!open) {
	    return;
	}

	// Check to make sure sPort has reference to avoid a NPE.
	if (sPort != null) {
	    try {
		// close the i/o streams.
	    	os.close();
	    	is.close();
	    } catch (IOException e) {
            ezlink.info("closeConnection Exception():  ");
            ezlink.error(new Object(), e);
		System.err.println(e);
	    }

	    // Close the port.
	    sPort.close();

	    // Remove the ownership listener.
	    portId.removePortOwnershipListener(this);
	}

	open = false;
    }

    /**
    Send a one second break signal.
    */
    public void sendBreak() {
	sPort.sendBreak(1000);
    }

    /**
    Reports the open status of the port.
    @return true if port is open, false if port is closed.
    */
    public boolean isOpen() {
	return open;
    }

    /**
    Handles SerialPortEvents. The two types of SerialPortEvents that this
    program is registered to listen for are DATA_AVAILABLE and BI. During
    DATA_AVAILABLE the port buffer is read until it is drained, when no more
    data is availble and 30ms has passed the method returns. When a BI
    event occurs the words BREAK RECEIVED are written to the messageAreaIn.
    */

    public void serialEvent(SerialPortEvent e)
    {
        System.out.println("+++SERIAL EVENT TYPE ++++++++++++++++ : "+e.getEventType());
        ezlink.info("serialEvent() received in " + SerialConnection.class.getName());
 	// Create a StringBuffer and int to receive input data.
	StringBuffer inputBuffer = new StringBuffer();
	int newData = 0;

	// Determine type of event.
	switch (e.getEventType())
	{

	    // Read data until -1 is returned. If \r is received substitute
	    // \n for correct newline handling.
	    case SerialPortEvent.DATA_AVAILABLE:
	    byte[] readBuffer = new byte[500];
		int numBytes = 0;
		inputdata = null;

		try {
				System.out.println("Data Received from com Port="+is.available());
                                        ezlink.info("Data Received from com Port= " +is.available() );

				while (is.available() > 0)
				{
					numBytes = is.read(readBuffer);
					dataHandler.addISOPart(ISOUtil.hexString(readBuffer,0,numBytes));

				}


				String strResponse=null;
				if((strResponse = dataHandler.getNextISO(1)) !=null)
				{
					System.out.println("Response="+strResponse);
                                        ezlink.info("Response= : " +strResponse );
					inputdata = strResponse;

				}
				else
				{
					System.out.println("Full data not received from terminal");
                                        ezlink.info("ull data not received from terminal!! "  );
				}

				dataRec =true;

		} catch (IOException exp) {
                    System.out.println("serialEvent Exception():  ");
                    exp.printStackTrace();
                    System.out.println("serialEvent Exception():  ");
                    ezlink.info("serialEvent Exception():  ");
                    ezlink.error(new Object(), exp);
                }

		break;

	    // If break event append BREAK RECEIVED message.
	    case SerialPortEvent.BI:
		System.out.println("\n--- BREAK RECEIVED ---\n");
                ezlink.info("\n--- BREAK RECEIVED ---\n "  );
	}

    }

    /**
    Handles ownership events. If a PORT_OWNERSHIP_REQUESTED event is
    received a dialog box is created asking the user if they are
    willing to give up the port. No action is taken on other types
    of ownership events.
    */
    public void ownershipChange(int type) {
	if (type == CommPortOwnershipListener.PORT_OWNERSHIP_REQUESTED) {
	    //PortRequestedDialog prd = new PortRequestedDialog(parent);
	    System.out.println("UNABLE TO CONNECT!! PORT IS ACCESSED BY OTHER USER");
            ezlink.info("ownershipChange() : UNABLE TO CONNECT!! PORT IS ACCESSED BY OTHER USER "  );
	}
    }

    /**
    Send the sms message to the recipient. After sending the message wait for
    the response on the status of the message delivery.
    */

	public synchronized byte[] sendMessage(byte[] strReq)
	{
		byte[] response = null;
		try
		{
			System.out.println("Writing data="+ISOUtil.hexString(strReq,0,strReq.length)+" Length : "+strReq.length);
                        ezlink.info("sendMessage() : Writing data= : "+ISOUtil.hexString(strReq,0,strReq.length)  );
			os.write(strReq);
			response = read();
			System.out.println("Data Received="+response);
                         ezlink.info("sendMessage() : Data Received= : "+response  );
 
		}catch(Exception e){
                    System.out.println("++++CONNECTION PROBLEM -PLEASE CHECK TERMINAL CONNECTION+++++++++++++++++++++++++++++++++++");
                    System.out.println("SerialConnection : sendMessage() - Exception:"+e);
                    e.printStackTrace();
                    ezlink.info("++++++++++++CONNECTION PROBLEM -PLEASE CHECK TERMINAL CONNECTION++++++++++++++++  ");
                    ezlink.info("SerialConnection : sendMessage() - Exception:  ");
                    ezlink.error(new Object(), e);
                }
		return response;
	}

    /**
    This will be called only after sending the sms message to known on the status of the
    message delivery.
    */

	public byte[] read()
    {
		//byte[] responseData = ISOUtil.hex2byte("070088888888");
		byte[] responseData = null;
        try
        {
			long start = System.currentTimeMillis();
			long end = System.currentTimeMillis();

				while ((end - start) < 45000)
				{
                                    System.out.println("++++++ If parameters : read() : "+inputdata+" : "+dataRec);
					if (inputdata != null && dataRec)
					{
                                            System.out.println("INSIDE IF -read()");
						responseData = ISOUtil.hex2byte(inputdata);
						dataRec=false;
						break;

					} else
					{
                                              System.out.println("INSIDE else -read()");
						end = System.currentTimeMillis();
						Thread.sleep(1000);
					}
				}

        }
        catch(Exception e)
        {
            System.err.println("ConnectionHandlerLocal$WriterThread.run(): Interrupted!");
            ezlink.info("SerialConnection : read() - Exception:  ");
                    ezlink.error(new Object(), e);
        }
        finally
		{
			System.out.println("&&&&&&&&&& In Finally... &&&&&&&");
                         ezlink.info("&&&&&&&&&& In Finally... &&&&&&&  ");
			dataHandler.strISODump.setLength(0);
			if(sPort!=null)
			{
				sPort.close();
				System.out.println("Port Closed");
                                ezlink.info("&&&&&&&&&& Port Closed... &&&&&&&  ");
			}
	 	}

	 	System.out.println("inside read() : ReadData="+new String(responseData));
                ezlink.info("ReadData= :   "+new String(responseData));

        return responseData;
    }



}
