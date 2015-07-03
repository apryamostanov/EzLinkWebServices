/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wirecard.ezlinkwebservices.constants;

import java.math.BigDecimal;

/**
 *
 * @author WCCTTI-JANAHAN
 */
public interface StringConstants {

    public interface Common {

        public final String SOURCE_ID = "WD";
        public final String TRANX_STATUS_DEBIT = "D";
        public final String TRANX_CODE_DEBIT = "DEB";
        public final String TRANX_STATUS_RECIEPT = "R";
        public final String TRANX_STATUS_QR = "Q";
        public final String TRANX_STATUS = "C";
        public final String VERSION = "1.0";
        
        public final String TRANX_TYPE_RECIEPT = "REP";
        public final String TRANX_TYPE_DEBIT = "DEB";

        public final String CONNECTION_ISSUE_MESSAGE = "CONNECTION ISSUE";
        public final String CONNECTION_ISSUE_MESSAGE_INFO = "PLEASE CONTACT ADMIN";
        
         public final String TRANX_COMPLETED_MESSAGE = "ALREADY TRANX COMPLETED";
        public final String TRANX_COMPLETED_MESSAGE_INFO = "ALREADY TRANX COMPLETED";

        public final String INSERTION_FAILED_MESSAGE = "INSERTION/UPDATION FAILED";
        public final String INSERTION_FAILED_MESSAGE_INFO = "PLEASE CONTACT ADMIN";

        public final String REQUIRED_FIELD_MISSING = "REQUIRED FIELD MISSING";
        public final String REQUIRED_FIELD_MISSING_INFO = "PLEASE CHECK FIELDS IN YOUR REQUEST";

        public final String NO_MERCHANT_AVAILABLE = "NO MERCHANT AVAILBLE";
        public final String NO_MERCHANT_AVAILABLE_INFO = "PLEASE CONTACT ADMIN";
        
        
        public final String NO_TRANSCATION_AVAILABLE = "NO TRANSACTION AVAILBLE";
        public final String NO_TRANSCATION_AVAILABLE_INFO = "NO TRANSACTION YET";
        
        public final String NO_TRANSCATION_DETAIL_AVAILABLE = "TRANSACTION DETAIL NOT AVAILBLE";
        public final String NO_TRANSCATION_DETAIL_AVAILABLE_INFO = "TRANSACTION DETAIL NOT AVAILBLE";
        
        public final String RECIEPTDATA_UPDATION_FAILED = "RECIEPT DATA UPDATION FAILED";
        public final String RECIEPTDATA_UPDATION_FAILED_INFO = "RECIEPT DATA UPDATION FAILED";

        public final String STATUS_SUCCESS = "SUCCESS";
        public final String STATUS_SUCCESS_INFO = "SUCCESSFULLY UPDATED";

        public final String STATUS_FAILED = "FAILED";
        public final String STATUS_FAILED_INFO = " UPDATION FAILED";

        public final String DBT_CMD_USER = "DEB";
        public final String REC_DTA_USER = "REC";
        
        public final String XOR_FORMAT = "FFFFFF";

        public final String TIME_OUT = "TIME OUT";
    }

    public interface Header {

        public final BigDecimal VERSION = BigDecimal.ONE;
        public final String SIGNATURE = "todo";
        public final String ENCRYPTION_CRYPTOGRAM = "todo";
        public final String ACCESSCODE = "todo";
    }

    public interface ExceptionInfo {

        public final String INVALID_SECURITY_LEVEL_MESSAGE = "INVALID SECURITY LEVEL";
        public final String INVALID_SECURITY_LEVEL_MESSAGE_INFO = "PLEASE CHECK CONFIGURED SECURITY LEVEL";

        public final String INVALID_ACCESS_CODE_MESSAGE = "INVALID ACCESS CODE";
        public final String INVALID_ACCESS_CODE_MESSAGE_INFO = "PLEASE CHECK CONFIGURED ACCESS CODE";

        public final String NO_TRANSACTION_AVAILABLE_MESSAGE = "NO TRANSACTION AVAILABLE";
        public final String NO_TRANSACTION_AVAILABLE_MESSAGE_INFO = "PLEASE CHECK ORDER NUMBER AND MERCHANT TRANX REF NUMBER";

        public final String TRANX_COMPLETED_MESSAGE = "TRANSACTION ALREADY COMPLETED";
        public final String TRANX_COMPLETED_MESSAGE_INFO = "CAN NOT PROCEAD WITH THIS TRANSACTION";
        
        public final String DB_INSERTION_FAILED_MESSAGE = "TRANSACTIONLOG INSERTION FAILED";
        public final String DB_INSERTION_FAILED_MESSAGE_INFO = "TRANSACTIONLOG INSERTION FAILED";

        public final String TERMINAL_CONNECTION_ERROR_MESSAGE = "TERMINAL CONNECTION ERROR";
        public final String TERMINAL_CONNECTION_ERROR_MESSAGE_INFO = "PLEASE CHECK TERMINAL CONNECTION";
        
        public final String DB_CONNECTION_ERROR_MESSAGE = "TERMINAL CONNECTION ERROR";
        public final String DB_CONNECTION_ERROR_MESSAGE_INFO = "PLEASE CHECK TERMINAL CONNECTION";

        public final String NO_DEBITCOMMAND_DETAILS_AVAILABLE_MESSAGE = "NO TRANSACTION AVAILABLE";
        public final String NO_DEBITCOMMAND_DETAILS_AVAILABLE_MESSAGE_INFO = "PLEASE DO DEBIT COMMAND REQUEST FIRST";
        
         public final String RECIEPT_DATA_UPDATION_MESSAGE = "RECIEPT DATA UPDATION FAILED";
        public final String RECIEPT_DATA_UPDATION_MESSAGRE_INFO = "RECIEPT DATA UPDATION FAILED";
    }
    
     public interface ResponseCode {

        
        public final String SUCCESS = "00";
        public final String UNABLE_TO_LOCATE_RECORD = "25";
        public final String TERMINAL_CONNECTION_FAILED = "33";
        
        public final String RECIEPT_DATA_UPDATION_FAILED = "44";
        
        public final String TRANX_COMPLETED_ALREADY = "99";
        public final String NO_DEBIT_COMMAND_DETAILS_AVAILABLE = "88";
        public final String TIME_OUT = "12";
        
       
    }
}
