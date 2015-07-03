package org.transinfo.messaging.communication.posdailer;

//import com.transinfo.tplus.debug.*;

import org.jpos.iso.*;

public class DataHandler{

	public StringBuffer strISODump = new StringBuffer();

	public void addISOPart(String data) {

//System.out.println("Previous Data Available="+new String(strISODump));
//System.out.println("Data About to add="+data);

		if(data!=null && !data.equals(""))
		strISODump.append(data);
//System.out.println(" Current data Available="+new String(strISODump));
		//if (DebugWriter.boolDebugEnabled) DebugWriter.write("ClientData:addISOPart"+strISODump.length());
	}


	public String getNextISO(int intmsg)
	{

		String strResData=null;

		try
		{
			//System.out.println("Data ="+new String(strISODump));
			strResData = new String(strISODump);
			if(strResData.startsWith("06"))
			{
				strResData = strResData.substring(2);
			}

				if(strResData.startsWith("02"))
				{
					 String strlen = strResData.substring(2,6);

					 int intLen = Integer.parseInt(strlen)*2+10;
					// System.out.println("Data Length="+strISODump.length()+"   "+intLen);

					 if(strISODump.length() >= intLen)
					 {
						strResData = strResData.substring(6,intLen);
						//strISODump.replace(0,intLen, "");
						if(validate(strlen,strResData))
						{
						   strResData = strResData.substring(0,strResData.length()-4);
						   return strResData;
					 	}
					 	else
					 	{
							System.out.println("Data Validation Error!! Data is not ended with 03H or Or-ing is wrong");
					 	}
					 }
				}
				else
				{

					System.out.println("DataHandler: Message is not starting with 02H");
					System.out.println(" Data ="+strResData);

				}


		}
		catch(Exception exp)
		{
			System.out.println("In getNextISO"+exp);
			//strISODump.setLength(0);
	 	}

	 	return strResData;
	 }


   public static boolean validate(String strlen,String isoData)
   {
	   boolean result =false;
	   if((isoData.substring(isoData.length()-4,isoData.length()-2).startsWith("03")))
	   {
		   result = true;
	   }
		System.out.println("Validate="+result);
		return result;
   }


	 public static void main(String s[])
	 {


		// byte[] b = ISOUtil.hex2byte("0205600000000002003020078020C00204000000000000000100A0100100520001000000374541822001564124D060120101234226100000303030303030313130303030303030303030303030313101185F2A02070282025C008407A00000000310109A030401269C01009F02060000000001009F03060000000000009F0902008C9F1A0207029F2608BB67B3EF39BAA0CE9F2701809F3303E020C89F3501229F3602001B9F3704BB5D5F445F3401019F34031E03009F100706990A03A0A1009505400000800000063030303030320205600000000002003020078020C002");
		// ClientData cdata = new ClientData();
		try
		 {

		 //addISOPart("020205600000000002003020078020C00204000000000000000100A0100100520001000000374541822001564124D060120101234226100000303030303030313130303030303030303030303030313101185F2A02070282025C008407A00000000310109A030401269C01009F02060000000001009F03060000000000009F0902008C9F1A0207029F2608BB67B3EF39BAA0CE9F2701809F3303E020C89F3501229F3602001B9F3704BB5D5F445F3401019F34031E03009F100706990A03A0A1009505400000800000063030303030320388Testingdata");
		// addISOPart("0200060700999999990308");
		// String str=getNextISO(1);
		// System.out.println("String ="+str);


		/* System.out.println(str == null ? 0 : str.length());
		 System.out.println(cdata.strISODump.length());
		 cdata.dumpString(str);
		 System.out.println("***************************");
		 b = ISOUtil.hex2byte("400000800000063030303030320205600000000002003020078020C002");
		 cdata.addISOPart(new String(b));
		 str=cdata.getNextISO();
		 System.out.println(str == null ? 0 : str.length());
		 System.out.println(cdata.strISODump.length());
		 cdata.dumpString(str);
		 System.out.println("***************************");
		 b = ISOUtil.hex2byte("04000000000000000100A0100100520001000000374541822001564124D060120101234226100000303030303030313130303030303030303030303030313101185F2A02070282025C008407A00000000310109A030401269C01009F02060000000001009F03060000000000009F0902008C9F1A0207029F2608BB67B3EF39BAA0CE9F2701809F3303E020C89F3501229F3602001B9F3704BB5D5F445F3401019F34031E03009F100706990A03A0A100950540000080000006303030303032");
		 cdata.addISOPart(new String(b));
		 str=cdata.getNextISO();
		 System.out.println(str == null ? 0 : str.length());
		 System.out.println(cdata.strISODump.length());
		 cdata.dumpString(str);
		 System.out.println("3");*/

	    }
	    catch(Exception e){System.out.println(e);}
 	}

 	public void dumpString(String str)
 	{
		try{
			 if(str!=null)
			System.out.println(ISOUtil.hexString(str.getBytes()));
	  }catch(Exception e){System.out.println(e);}
   }
}


