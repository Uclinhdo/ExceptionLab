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
public class CustomerDatabaseException extends DataSystemException {
    private static String msg = "Customer information could not be found.";
    public CustomerDatabaseException() {
        super(msg);
    }

    public CustomerDatabaseException(String message) {
        super(msg);
    }

    public CustomerDatabaseException(String message, Throwable cause) {
        super(msg, cause);
    }

    public CustomerDatabaseException(Throwable cause) {
        super(cause);
    }

    public CustomerDatabaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(msg, cause, enableSuppression, writableStackTrace);
    }
    @Override
    public String getMessage()
    {
        return msg;
    }
    
}
