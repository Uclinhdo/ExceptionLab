/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

import lab3.*;

/**
 *
 * @author linhdo
 */
public class NumericRangeException extends Exception {

    public NumericRangeException() {
    }

    public NumericRangeException(String message) {
        super(message);
    }

    public NumericRangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumericRangeException(Throwable cause) {
        super(cause);
    }

    public NumericRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
    //pick a sub class that close to this exception
    //but choose the check exception, not the unchecked one.
    
}
