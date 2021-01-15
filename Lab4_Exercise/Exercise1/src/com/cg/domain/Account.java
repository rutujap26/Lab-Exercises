/**
 * This account domain is used for data transfer between layers.
 * 
 * @author rutuja pise
 */
package com.cg.domain;

public class Account {
	/**
	 * account number of user
	 */
	private Long accNo;
	/**
	 * name of the account holder
	 */
	private String accountHolder;
	
	/**
	 * Constructor of Account class
	 * @param accNo 
	 * @param accountHolder2
	 */
	


	public Long getAccNo() {
		return accNo;
	}

	public Account(Long accNo, String accountHolder) {
		super();
		this.accNo = accNo;
		this.accountHolder = accountHolder;
	}

	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	
}
