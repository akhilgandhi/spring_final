package com.stackroute.keepnote.exception;

public class UserAlreadyExistsException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 405754728968989628L;

	public UserAlreadyExistsException(String message) {
        super(message);
    }
}
