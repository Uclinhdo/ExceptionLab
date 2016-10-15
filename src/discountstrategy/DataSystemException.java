/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author linhdo
 */
public class DataSystemException extends Exception {
    public static String msg = "Data could not find!";
    public DataSystemException() {
        super(msg);
    }

    public DataSystemException(String message) {
        super(msg);
    }

    public DataSystemException(String message, Throwable cause) {
        super(msg, cause);
    }

    public DataSystemException(Throwable cause) {
        super(cause);
    }

    public DataSystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(msg, cause, enableSuppression, writableStackTrace);
    }
    
}
