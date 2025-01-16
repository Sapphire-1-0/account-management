package com.brihaspathee.sapphire.exception;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 1/15/25
 * Time: 7:24 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.exception
 * To change this template use File | Settings | File and Code Template
 */
public class AccountNotFoundException extends RuntimeException {

    /**
     * Constructor with message
     * @param message - the error message
     */
    public AccountNotFoundException(String message) {
        super(message);
    }

    /**
     * Constructor with message and throwable
     * @param message - the error message
     * @param cause - the cause
     */
    public AccountNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
