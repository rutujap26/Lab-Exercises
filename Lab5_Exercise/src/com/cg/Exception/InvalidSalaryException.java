/**
 * 
 * 
 * @author rutuja pise
 */

package com.cg.Exception;

public class InvalidSalaryException extends Exception{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Create InvalidSalaryException object without error message
	 */
	public InvalidSalaryException() {
		super();
	}
	
	/**
	 * Create InvalidSalaryException object with error message
	 * @param errMsg 
	 */
	public InvalidSalaryException(String errMsg) {
		super(errMsg);
	}

}
