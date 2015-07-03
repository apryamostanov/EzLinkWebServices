package org.transinfo.messaging.communication.posdailer;

import gnu.io.*;
import java.io.IOException;
import java.util.*;
import java.util.Enumeration;

import org.jpos.iso.*;

public class DialerPool extends ObjectPool
{

public static DialerPool dialerPool;
public static synchronized DialerPool getInstance() throws Exception
{

			try
			{
				if(dialerPool == null)
				{
					dialerPool = new DialerPool();
					dialerPool.createPool();
				}

			}catch(Exception exp){
				 System.out.println("Error while Creating SocketManager Instance"+exp);
				 throw exp;
			}

		return  dialerPool;
 }



Object create() throws Exception
{
  return new String("No Need of this method");
}

boolean validate( Object o ){ return true;}

void expire( Object o ){}

public void createPool()
{
	System.out.println("create Pool");
 	 Enumeration portList = CommPortIdentifier.getPortIdentifiers();
      while (portList.hasMoreElements())
      {
		  System.out.println("Port is available");
        CommPortIdentifier portId = (CommPortIdentifier) portList.nextElement();
         if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL && !portId.getName().equals("COM1"))
         {
			 System.out.println("Port Name="+portId.getName()+"  "+portId.getCurrentOwner());
			 if(portId.getCurrentOwner() == null)
			 {

				try
				 {
				   SerialManager objSerial = new SerialManager(portId.getName());
				   if(objSerial != null)
				   {
						byte responseData[] = objSerial.sendAndReceiveData(ISOUtil.hex2byte("02001160000000000700555555550308"));
						if(responseData !=null)
						{
							String resString = ISOUtil.hexString(responseData);
							if(resString.equals("6000000000070066666666"))
							{
								checkIn(objSerial);
						 	}
						 	else
						 	{
								System.out.println(" Invalid Data");
						 	}
					    }
					 	else
					 	{
							System.out.println("No Terminal is attached to Com Port"+portId.getName());
						}


				   }
				   else
				   {
						System.out.println("Unable to create the Communication with Dialer");
				   }

				   poolSize();

				 }
				 catch(SerialConnectionException serialException)
				 {
					 System.out.println("Error while SendandRetrieve Data from Terminal");
				 }
				 catch(Exception exp)
				 {
					 System.out.println("Application error while SendandRetrieve Data from Terminal");
				 }


	         }

      }

  }

}

public Object getSerialObject()throws Exception
{
	   int interval=0;
	   Object conn = null;
	   while(interval<30000)
	   {
			System.out.println(Thread.currentThread().getName()+"Waiting for terminal Connection "+interval);
		   Thread.sleep(1000);
		   conn = checkOut();
		   if(conn!=null)
		   {
			   break;
		   }
		   interval = interval+1000;
		}


      return conn;
}


public void close(Object obj) throws Exception
{
	System.out.println("Dailer Close");
	checkIn(obj);
}

public static void main(String s[])throws Exception
{
	  DialerPool dp =  DialerPool.getInstance();
	  System.out.println("--------------- FINISH ----------------");
	  System.out.println(dp.getSerialObject());
	  System.out.println(dp.getSerialObject());
	  System.out.println(dp.getSerialObject());
	  System.out.println(dp.getSerialObject());



				/*try
				 {
				   SerialManager objSerial = new SerialManager("COM4");
				   if(objSerial != null)
				   {
						byte responseData[] = objSerial.sendAndReceiveData(ISOUtil.hex2byte("02001160000000000700555555550308"));
			  		}


				 }
				 catch(SerialConnectionException serialException)
				 {
					 System.out.println("Error while SendandRetrieve Data from Terminal");
				 }
				 catch(Exception exp)
				 {
					 System.out.println("Application error while SendandRetrieve Data from Terminal");
				 }*/




}

}