package com.exceptions.customised;

public class TooYoungException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8445998878998204135L;

	TooYoungException(String message){
		super(message);
	}
}
