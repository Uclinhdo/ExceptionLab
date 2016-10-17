/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author linhdo
 */
public class FullNameException extends Exception {
    private static String msg = "Name is not valid. ";
    public FullNameException() {
        super(msg);
    }

    public FullNameException(String message) {
        super(msg);
    }

    public FullNameException(String message, Throwable cause) {
        super(msg, cause);
    }

    public FullNameException(Throwable cause) {
        super(cause);
    }

    public FullNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(msg, cause, enableSuppression, writableStackTrace);
    }
    
    
    
    //pick a sub class that close to this exception
    //but choose the check exception, not the unchecked one.
    
}
