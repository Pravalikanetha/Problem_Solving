package com.exceptions.customised;

public class TooOldException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8445998878998204135L;

	TooOldException(String message){
		super(message);
	}
}
