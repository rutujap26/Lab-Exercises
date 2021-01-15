/**
 * 
 * 
 * @author rutuja pise
 */

package com.cg.Exception;

public class InvalidNameException extends Exception{
	
	private static final long serialVersionUID = 1L;

	/**
	 * Create InvalidNameException object without error message
	 */
	public InvalidNameException() {
		super();
	}
	
	/**
	 * Create InvalidNameException object with error message
	 * @param errMsg
	 */
	public InvalidNameException(String errMsg) {
		super(errMsg);
	}

}
