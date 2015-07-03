package org.transinfo.messaging.communication.posdailer;

import java.util.HashMap;

public class HeaderUtil
{


	static HashMap map = new HashMap();
static{
	map.put("0","30");
	map.put("1","31");
	map.put("2","32");
	map.put("3","33");
	map.put("4","34");
	map.put("5","35");
	map.put("6","36");
	map.put("7","37");
	map.put("8","38");
	map.put("9","39");
}


public static String getReqHeader(String stCardRndNo,String stTerRndNo,String stAmt,String stPurse)
{
	String strConstructMsg="";
//DC7934737E93BE4F FFFFFE "333401130203000A820013881000130007177762B20D5307D50E3F3B24D01C4001FD1EFF75004E202556FBDA1E2088881C00A0FFFFFF2570016643544E3536323120550001000400005555000000000000000000000000000000000000000000000000AB273C2F13AFC9FB03F79059E20C3EC73BF7

	strConstructMsg = "36303030303030303030313132303030301C";
	strConstructMsg = strConstructMsg+"33310008"+stCardRndNo+"1C";
	strConstructMsg = strConstructMsg+"33320008"+stTerRndNo+"1C";
	strConstructMsg = strConstructMsg+"33330003"+stAmt+"1C";
	strConstructMsg = strConstructMsg+"33340113"+stPurse+"1C";
	strConstructMsg = strConstructMsg+"33350012DC7934737E93BE4FDC7934731C";

	System.out.println("Len="+hexString(str2bcd(strConstructMsg.length()+"",true)));
	strConstructMsg = "02"+hexString(str2bcd(strConstructMsg.length()+"",true))+strConstructMsg+"037A";

	//strConstructMsg= "02037436303030303030303030313132303030301C33310008DC7934737E93BE4F1C33320008DC7934737E93BE4F1C33330003FFFFFE1C333401130203000A820013881000130007177762B20D5307D50E3F3B24D01C4001FD1EFF75004E202556FBDA1E2088881C00A0FFFFFF2570016643544E3536323120550001000400005555000000000000000000000000000000000000000000000000AB273C2F13AFC9FB03F79059E20C3EC73BF71C33350012DC7934737E93BE4FDC7934731C037A";
	System.out.println("Data="+strConstructMsg);


return strConstructMsg;
}



/*public static String getReqHeader(int msgLen)
{
	/*String strLen = new Integer(msgLen+92).toString();
	    System.out.println("BCD"+Integer.parseInt(strLen,16) +"   "+ISOUtil.hexString(ISOUtil.str2bcd(strLen,true)));

		String TotMsgLen = ISOUtil.hexString(ISOUtil.str2bcd(strLen,true));

		System.out.println("TotMsgLen"+TotMsgLen);*/
	//	System.out.println("Hex"+Integer.parseInt(""+msgLen,16));

	//	String TotMsgLen = new Integer(msgLen+46).toString();
	//	System.out.println("TotMsgLen"+TotMsgLen);
   // return "2E01"+asciiLen(TotMsgLen)+"30303031303334342020203030303135383430202020000000003030303030303030003030303030";
  //    return "2E82"+asciiLen(TotMsgLen)+"30303031303334342020203330343730343831202020000000013130303030303030003030303030";

      // CHANGE THIS INFORMATION IN ABOVE RETURN MSG like below. ALL DATA are IN ASCII

      // 3030303130333434202020 is Forward IIN(F33)
      // 3237333830343138202020 is Issuer IIN (F32).
      // 30470481
//}

public static String getResHeader(String strHeader,int msgLen)
{
		String TotMsgLen = new Integer(msgLen+46).toString();
    return strHeader.substring(0,4)+asciiLen(TotMsgLen)+strHeader.substring(34,56)+strHeader.substring(12,34)+strHeader.substring(56);
}

public static String asciiLen(String str)
{
	String strLen="";
	for(int i=0;i<str.length();i++)
	{
		strLen=strLen+(String)map.get(str.substring(i,i+1));
     }
System.out.println(strLen);
   strLen = ("30303030"+strLen).substring(strLen.length());
System.out.println(strLen);
   return strLen;
}

/**
     * converts to BCD
     * @param s - the number
     * @param padLeft - flag indicating left/right padding
     * @param d The byte array to copy into.
     * @param offset Where to start copying into.
     * @return BCD representation of the number
     */
 public static byte[] str2bcd(String s, boolean padLeft) {
        int len = s.length();
        byte[] d = new byte[ (len+1) >> 1 ];
        return str2bcd(s, padLeft, d, 0);
    }
    public static byte[] str2bcd(String s, boolean padLeft, byte[] d, int offset) {
        int len = s.length();
        int start = (((len & 1) == 1) && padLeft) ? 1 : 0;
        for (int i=start; i < len+start; i++)
            d [offset + (i >> 1)] |= (s.charAt(i-start)-'0') << ((i & 1) == 1 ? 0 : 4);
        return d;
    }


 public static String hexString(byte[] b) {
    StringBuffer d = new StringBuffer(b.length * 2);
    for (int i=0; i<b.length; i++) {
        char hi = Character.forDigit ((b[i] >> 4) & 0x0F, 16);
        char lo = Character.forDigit (b[i] & 0x0F, 16);
        d.append(Character.toUpperCase(hi));
        d.append(Character.toUpperCase(lo));
    }
    return d.toString();
  }


public static void main(String ss[])
{

//	System.out.println(getReqHeader("11","22"));

String split []= "36303030303030303030313132303030301C34310016ED2199137CC307A069E3B8F45D1534061C3432000854495430303031201C3433001647058A8594B61B0707BD7794B3F7078D1C34340016134DBF682CD22C68A60D1F0E71F929D01C34350012DC7934737E93BE4FDC7934731C".split("1C");
System.out.println(split.length+"\n   "+split[0]+" \n "+split[1]+" \n "+split[2]+" \n "+split[3]+" \n  "+split[4]+"\n  "+split[5]);
System.out.println(split.length+" \n  "+split[0]+"\n  "+split[1].substring(8)+"\n  "+split[2].substring(8)+"\n  "+split[3].substring(8)+"\n   "+split[4].substring(8)+"\n  "+split[5].substring(8));


}


public static String getReqRecieptData(String stEncRecData,String stRecSesskey,String strDebitSessionKey,String stPan,String stEzlinkString,String stMacKey )
{
	String strConstructMsg="";
        String stRefNo="DC7934737E93BE4FDC793473";
        stMacKey="11111111111111111111111111111111";
        
        String EzlinkStringLength="0"+(stEzlinkString.length()/2);
        stEncRecData=stEncRecData.substring(0, stEncRecData.length()-4);
        
	strConstructMsg = "36303030303030303030313132303030331C";
	strConstructMsg = strConstructMsg+"33350012"+stRefNo+"1C";
	strConstructMsg = strConstructMsg+"33360024"+stEncRecData+"1C";
	strConstructMsg = strConstructMsg+"33370016"+stRecSesskey+"1C";
	strConstructMsg = strConstructMsg+"33380008"+stPan+"1C";
        strConstructMsg = strConstructMsg+"33390016"+stMacKey+"1C";
	strConstructMsg = strConstructMsg+"3430"+EzlinkStringLength+stEzlinkString+"1C";
        strConstructMsg=strConstructMsg+"34340016"+strDebitSessionKey+"1C";


	System.out.println("getReqRecieptData: Len="+hexString(str2bcd(strConstructMsg.length()+"",true)));
	strConstructMsg = "02"+hexString(str2bcd(strConstructMsg.length()+"",true))+strConstructMsg+"037A";

	//strConstructMsg= "02037436303030303030303030313132303030301C33310008DC7934737E93BE4F1C33320008DC7934737E93BE4F1C33330003FFFFFE1C333401130203000A820013881000130007177762B20D5307D50E3F3B24D01C4001FD1EFF75004E202556FBDA1E2088881C00A0FFFFFF2570016643544E3536323120550001000400005555000000000000000000000000000000000000000000000000AB273C2F13AFC9FB03F79059E20C3EC73BF71C33350012DC7934737E93BE4FDC7934731C037A";
	System.out.println("getReqRecieptData ; Data="+strConstructMsg);


return strConstructMsg;
}

public static String getResRecieptData(String strHeader,int msgLen)
{
		String TotMsgLen = new Integer(msgLen+46).toString();
    return strHeader.substring(0,4)+asciiLen(TotMsgLen)+strHeader.substring(34,56)+strHeader.substring(12,34)+strHeader.substring(56);
}


}