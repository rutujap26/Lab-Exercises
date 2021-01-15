/**
 * 
 * 
 * @author rutuja pise
 */

package com.cg.Exception;

public class InvalidAgeException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Create InvalidAgeException object without error message
	 */
	public InvalidAgeException() {
		super();
	}
	
	/**
	 * Create InvalidAgeException object with error message
	 * @param errMsg
	 */
	public InvalidAgeException(String errMsg) {
		super(errMsg);
	}
}
