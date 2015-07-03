package org.transinfo.messaging.communication.posdailer;

import com.wirecard.ezlinkwebservices.dto.ETerminalDataDto;
import gnu.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.*;
import java.util.Enumeration;

import org.jpos.iso.*;

/**
 * Main file for SerialDemo program. This program illustrates many of the
 * abilities of the javax.comm api. This file contains the GUI framework that
 * the program runs in.
 */
public class SerialManager {

    private static final org.apache.log4j.Logger ezlink = org.apache.log4j.Logger.getLogger(SerialManager.class);
    private SerialParameters parameters;
    private SerialConnection connection;
    private Properties props = null;
    private static final String CONFIG_BUNDLE_NAME = "SMSConfig";
    static SerialManager serialDemo = null;

    /**
     * Main method. Checks to see if the command line agrument is requesting
     * usage informaition (-h, -help), if it is, display a usage message and
     * exit, otherwise create a new <code>SerialDemo</code> and set it visible.
     */
    public static void main(String[] args) {
        try {

            serialDemo = new SerialManager();
            ETerminalDataDto objETerminalDataDto = serialDemo.getDebitCmd("DC7934737E93BE4F", "DC7934737E93BE4F", "FFFFFE", "0203000A820013881000130007177762B20D5307D50E3F3B24D01C4001FD1EFF75004E202556FBDA1E2088881C00A0FFFFFF2570016643544E3536323120550001000400005555000000000000000000000000000000000000000000000000AB273C2F13AFC9FB03F79059E20C3EC73BF7");

            //Commet this after testing with main method;
            //serialDemo.initConfig();
            //serialDemo.connection.sendMessage(ISOUtil.hex2byte("020079600037000002007024058000C10004164999770007848180000000000000011111011000100309020037003237303031393630313638313638313035323934202020000334343400063031313030320388"));
		/*	byte [] debitCommand = serialDemo.connection.sendMessage(ISOUtil.hex2byte(HeaderUtil.getReqHeader("DC7934737E93BE4F","DC7934737E93BE4F","FFFFFE","0203000A820013881000130007177762B20D5307D50E3F3B24D01C4001FD1EFF75004E202556FBDA1E2088881C00A0FFFFFF2570016643544E3536323120550001000400005555000000000000000000000000000000000000000000000000AB273C2F13AFC9FB03F79059E20C3EC73BF7")));
             System.out.println("Debit Command="+ ISOUtil.hexString(debitCommand));

             String strResSplit[] = ISOUtil.hexString(debitCommand).split("1C");
             for(int i=0;i<strResSplit.length;i++)
             {
             strResSplit[i] = strResSplit[i].substring(8);
             System.out.println(strResSplit[i]);
             }*/

            System.out.println("strDebitCmd " + objETerminalDataDto.getDebitCmd());

        } catch (Exception sExp) {
            System.out.println(sExp.getMessage());
        }

    }

    
    //public String getDebitCmd(String stCardRndNo, String stTerRndNo, String stAmt, String stPurse) throws Exception {
      public ETerminalDataDto getDebitCmd(String stCardRndNo, String stTerRndNo, String stAmt, String stPurse) throws Exception {
          
          ETerminalDataDto objETerminalDataDto=new ETerminalDataDto();

        String strDebitCmd = "";
        String strResHeader = "";
        String strActDebitCmd = "";
        String strUserData = "";
        String strSignSessionKey = "";
        String strDebitSessionKey = "";
        String strRefno = "";
        String strEzlinkString="";

        //String strDebitCmd=null;
        try {
            ezlink.info("\n-------SerialManager--------------START--------------------------------");
            ezlink.info("getDebitCmd Request received in " + SerialManager.class.getName());
            //Commet this after testing with main method;
            //serialDemo.initConfig()
            //serialDemo.connection.sendMessage(ISOUtil.hex2byte("020079600037000002007024058000C10004164999770007848180000000000000011111011000100309020037003237303031393630313638313638313035323934202020000334343400063031313030320388"));
          
//Debit command
            byte[] debitCommand = connection.sendMessage(ISOUtil.hex2byte(HeaderUtil.getReqHeader(stCardRndNo, stTerRndNo, stAmt, stPurse)));
            System.out.println("Debit Command=" + ISOUtil.hexString(debitCommand));
            ezlink.info("Debit Command= : " + ISOUtil.hexString(debitCommand));

         /*
            byte[] recieptData = connection.sendMessage(ISOUtil.hex2byte(HeaderUtil.getReqRecieptData("EEF6BAADFDDB93685EC111ACD05D7133E9472DA4416D0C079000")));
            System.out.println("Reciept Data =" + ISOUtil.hexString(recieptData));
            ezlink.info("Reciept Data= : " + ISOUtil.hexString(recieptData));
            */
            //debitCommand = ISOUtil.hex2byte("36303030303030303030313132303030301C343100165F332D39907B07D4C9C72441CF93C3461C3432000854495430303031201C3433001647058A8594B61B0707BD7794B3F7078D1C34340016134DBF682CD22C68A60D1F0E71F929D01C34350012DC7934737E93BE4FDC7934731C30303030303031313230303030");
                                /*
             String[] strResSplit = ISOUtil.hexString(debitCommand).split("1C");

             for(int i=0;i<strResSplit.length;i++)
             {
             strResSplit[i] = strResSplit[i].substring(8);
             System.out.println(strResSplit[i]);
             ezlink.info("strResSplit [ "+i+" ]" + strResSplit[i]);
             }
             strDebitCmd = "250315021403"+stTerRndNo+strResSplit[1]+strResSplit[2];
             System.out.println("strDebitCmd= "+strDebitCmd +"  Len  "+strDebitCmd.length());
             ezlink.info("strDebitCmd= "+strDebitCmd+" Len : " + strDebitCmd.length());
             
             */
            //String strResponse = ISOUtil.hexString(recieptData);
           String strResponse = ISOUtil.hexString(debitCommand);
            ezlink.info("+++strResponse Length : " + strResponse.length());
            ezlink.info("+++strResponse  : " + strResponse);
  //          if (strResponse.length() == 222) {
                //ezlink.info("+++Inside IF  : ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" );
                /* 
                //Old terminal
                strResHeader = strResponse.substring(0, 34);
                strActDebitCmd = strResponse.substring(44, 76);
                strUserData = strResponse.substring(86, 102);
                strSignSessionKey = strResponse.substring(112, 144);
                strDebitSessionKey = strResponse.substring(154, 186);
                strRefno = strResponse.substring(196, 220);
                */
                //New Terminal
                strResHeader = strResponse.substring(0, 34);
                 strRefno = strResponse.substring(44, 68); //24
                strActDebitCmd = strResponse.substring(78, 110);//32
                strUserData = strResponse.substring(120, 136);//16
                strSignSessionKey = strResponse.substring(146, 178);//32
                strDebitSessionKey = strResponse.substring(188, 220);//32
               
               strEzlinkString=strResponse.substring(230,strResponse.length()-2);
               
               
               
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Last two digits: "+strResponse.substring(strResponse.length()-2));
                System.out.println("Response length : "+strResponse.length());
                System.out.println("Response from terminal DC : "+strResponse);
                System.out.println("Ezlink String : "+strEzlinkString);
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                
                ezlink.info("\n--------SERIAL MANAGER-------RESPONSE--------------------");
                ezlink.info("strResHeader : " + strResHeader);
                ezlink.info("strActDebitCmd : " + strActDebitCmd);
                ezlink.info("strUserData : " + strUserData);
                ezlink.info("strSignSessionKey : " + strSignSessionKey);
                ezlink.info("strDebitSessionKey : " + strDebitSessionKey);
                ezlink.info("strRefno : " + strRefno);
                ezlink.info("strEzlinkString : " + strEzlinkString);
                ezlink.info("\n--------SERIAL MANAGER-------RESPONSE--------------------");

                strDebitCmd = "250315021403" + stTerRndNo + strActDebitCmd + strUserData;
                System.out.println("strDebitCmd= " + strDebitCmd + "  Len  " + strDebitCmd.length());
                ezlink.info("strDebitCmd= " + strDebitCmd + " Len : " + strDebitCmd.length());
                
                objETerminalDataDto.setDebitCmd(strDebitCmd);
                objETerminalDataDto.setTerminalSessionKey(strSignSessionKey);
                objETerminalDataDto.setDebitSessionKey(strDebitSessionKey);
                objETerminalDataDto.setEzLinkString(strEzlinkString);
/*
            } else {
                //ezlink.info("+++Inside IF  : ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" );
                System.out.println("Response from the Terminal not received fully...");
                ezlink.info("Response from the Terminal not received fully...!!!!!!!");
            }
*/
        } catch (Exception exp) {
            System.out.println(exp);
            ezlink.error(new Object(), exp);
            throw exp;
        }
        //return strDebitCmd;
        return objETerminalDataDto;
    }

    /**
     * Create new <code>SerialDemo</code> and initilizes it. Parses args to find
     * configuration file. If found, initial state it set to parameters in
     * configuration file.
     *
     * @param args command line arguments used when program was invoked.
     */
    public SerialManager(String commPort) throws SerialConnectionException {
        parameters = new SerialParameters();
        parameters.setPortName(commPort);
        connection = new SerialConnection(this, parameters);
        initConfig();

    }

    public SerialManager() throws SerialConnectionException {
        parameters = new SerialParameters();
        connection = new SerialConnection(this, parameters);
        initConfig();

    }

    public String getCommPort() {
        return parameters.getPortName();
    }

    /**
     * Responds to the menu items and buttons.
     */
    private void initConfig() throws SerialConnectionException {
        loadParams();
        openConnection();
    }

    /**
     * Opening Connection to the serial port.first check whether port is open if
     * not create new connection to the port.
     */
    private void openConnection() {
        try {
            if (connection.isOpen()) {
                System.out.println("Port Open!,Can't open a new connection while a port is open.");
                ezlink.info("Port Open!,Can't open a new connection while a port is open : ");
            }

            connection.openConnection();
        } catch (SerialConnectionException e2) {
            System.out.println(e2);
            ezlink.error(new Object(), e2);
        }

    }

    public byte[] sendAndReceiveData(byte[] requestData) {
        byte[] response = connection.sendMessage(requestData);
        System.out.println("In SerialManager");
        ezlink.info("In SerialManager : ");
        return response;
    }

    // Sends a break signal to the port.
    private void sendBreak() {
        connection.sendBreak();
    }

    /**
     * Cleanly shuts down the applicaion. first closes any open ports and cleans
     * up, then exits.
     */
    private void shutdown() {
        connection.closeConnection();
        System.exit(1);
    }

    /**
     * Set the parameters object to the settings in the properties object.
     */
    private void loadParams() throws SerialConnectionException {

        try {
            PropertyResourceBundle props = (PropertyResourceBundle) PropertyResourceBundle.getBundle(CONFIG_BUNDLE_NAME);
            System.out.println("BaudRate=" + props.getString("baudRate"));

            ezlink.info("BaudRate= : " + props.getString("baudRate"));

            parameters.setBaudRate(props.getString("baudRate"));
            parameters.setFlowControlIn(props.getString("flowControlIn"));
            parameters.setFlowControlOut(props.getString("flowControlOut"));
            parameters.setParity(props.getString("parity"));
            parameters.setDatabits(props.getString("databits"));
            parameters.setStopbits(props.getString("stopbits"));
            parameters.setPIN(props.getString("pin"));
            parameters.setSMC(props.getString("smc"));

            parameters.setDriver(props.getString("driver"));
            parameters.setURL(props.getString("url"));
            parameters.setUserName(props.getString("username"));
            parameters.setPassword(props.getString("password"));
            parameters.setPortName(props.getString("portName"));

        } catch (Exception exp) {
            ezlink.info("+++Error While setting parameters : +++");
            ezlink.error(new Object(), exp);
            throw new SerialConnectionException("Error While setting parameters=" + exp.getMessage());
        }

    }
//--------------------------getDecryptedRecieptData-------------------------------------------------------------
       //public String getDebitCmd(String stCardRndNo, String stTerRndNo, String stAmt, String stPurse) throws Exception {
      public String getDecryptedRecieptData(ETerminalDataDto objETerminalDataDto) throws Exception {
          
         // ETerminalDataDto objETerminalDataDto=new ETerminalDataDto();

        String strDecryptedRecieptDataRefNo = "";
        String strDecryptedRecieptData = "";
        String strResHeader="";
        

        //String strDebitCmd=null;
        try {
            ezlink.info("\n-------SerialManager--------------START----4 decrypting RecieptData-------------------");
            ezlink.info("getDecryptedRecieptData Request received in " + SerialManager.class.getName());
            //Commet this after testing with main method;
            //serialDemo.initConfig()
            //serialDemo.connection.sendMessage(ISOUtil.hex2byte("020079600037000002007024058000C10004164999770007848180000000000000011111011000100309020037003237303031393630313638313638313035323934202020000334343400063031313030320388"));
          
//Debit command
            byte[] decRecieptData = connection.sendMessage(ISOUtil.hex2byte(HeaderUtil.getReqRecieptData(objETerminalDataDto.getRecieptData(), objETerminalDataDto.getTerminalSessionKey(),objETerminalDataDto.getDebitSessionKey(), objETerminalDataDto.getCan(),objETerminalDataDto.getEzLinkString(), "")));
            System.out.println("Decrypted Reciept Data=" + ISOUtil.hexString(decRecieptData));
            ezlink.info("Decrypted Reciept Data= : " + ISOUtil.hexString(decRecieptData));

         /*
            byte[] recieptData = connection.sendMessage(ISOUtil.hex2byte(HeaderUtil.getReqRecieptData("EEF6BAADFDDB93685EC111ACD05D7133E9472DA4416D0C079000")));
            System.out.println("Reciept Data =" + ISOUtil.hexString(recieptData));
            ezlink.info("Reciept Data= : " + ISOUtil.hexString(recieptData));
            */
            //debitCommand = ISOUtil.hex2byte("36303030303030303030313132303030301C343100165F332D39907B07D4C9C72441CF93C3461C3432000854495430303031201C3433001647058A8594B61B0707BD7794B3F7078D1C34340016134DBF682CD22C68A60D1F0E71F929D01C34350012DC7934737E93BE4FDC7934731C30303030303031313230303030");
                                /*
             String[] strResSplit = ISOUtil.hexString(debitCommand).split("1C");

             for(int i=0;i<strResSplit.length;i++)
             {
             strResSplit[i] = strResSplit[i].substring(8);
             System.out.println(strResSplit[i]);
             ezlink.info("strResSplit [ "+i+" ]" + strResSplit[i]);
             }
             strDebitCmd = "250315021403"+stTerRndNo+strResSplit[1]+strResSplit[2];
             System.out.println("strDebitCmd= "+strDebitCmd +"  Len  "+strDebitCmd.length());
             ezlink.info("strDebitCmd= "+strDebitCmd+" Len : " + strDebitCmd.length());
             
             */
            //String strResponse = ISOUtil.hexString(recieptData);
           String strResponse = ISOUtil.hexString(decRecieptData);
            ezlink.info("+++Decrypted Reciept Data strResponse Length : " + strResponse.length());
            ezlink.info("+++Decrypted Reciept Data strResponse  : " + strResponse);
  //          if (strResponse.length() == 222) {
                //ezlink.info("+++Inside IF  : ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" );
               
                strResHeader = strResponse.substring(0, 34);
                 strDecryptedRecieptDataRefNo = strResponse.substring(44, 68); //24

               strDecryptedRecieptData=strResponse.substring(78,strResponse.length()-2);
               
               
               
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Last two digits: "+strResponse.substring(strResponse.length()-2));
                System.out.println("Response length : "+strResponse.length());
                System.out.println("Response from terminal DC : "+strResponse);
                System.out.println("Decrypted Ezlink String : "+strDecryptedRecieptData);
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                
                ezlink.info("\n--------SERIAL MANAGER-------RESPONSE----4DecryptedRecieptData----------------");
                ezlink.info("strResHeader : " + strResHeader);
             
                ezlink.info("strDecryptedRecieptDataRefNo : " + strDecryptedRecieptDataRefNo);
                ezlink.info("strDecryptedRecieptData : " + strDecryptedRecieptData);
                ezlink.info("\n--------SERIAL MANAGER-------RESPONSE--------------------");

                //strDebitCmd = "250315021403" + stTerRndNo + strActDebitCmd + strUserData;
                //System.out.println("strDebitCmd= " + strDebitCmd + "  Len  " + strDebitCmd.length());
                //ezlink.info("strDebitCmd= " + strDebitCmd + " Len : " + strDebitCmd.length());
                
                
/*
            } else {
                //ezlink.info("+++Inside IF  : ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" );
                System.out.println("Response from the Terminal not received fully...");
                ezlink.info("Response from the Terminal not received fully...!!!!!!!");
            }
*/
        } catch (Exception exp) {
            System.out.println(exp);
            ezlink.error(new Object(), exp);
            throw exp;
        }
        
        return strDecryptedRecieptData;
    }
}
