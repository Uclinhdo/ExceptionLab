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
public class ProductDatabaseException extends DataSystemException {
    private static String msg = "Product informarion could not be found.";
    public ProductDatabaseException() {
        super(msg);
    }

    public ProductDatabaseException(String message) {
        super(msg);
    }

    public ProductDatabaseException(String message, Throwable cause) {
        super(msg, cause);
    }

    public ProductDatabaseException(Throwable cause) {
        super(cause);
    }

    public ProductDatabaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(msg, cause, enableSuppression, writableStackTrace);
    }
    
    @Override
    public String getMessage()
    {
        return msg;
    }
    
}
