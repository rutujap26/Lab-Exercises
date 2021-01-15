/**
 * This SavingAccount will be used as data traveller object
 * 
 * @author rutuja pise
 */

package com.cg.domain;

public class SavingsAccount extends Account {
	/**
	 * balance in SavingAccount
	 */
	private double balance;

	/**
	 * Constructor of SavingAccount class
	 * @param accNo
	 * @param accountHolder
	 * @param balance
	 */
	public SavingsAccount(final Long accNo, final String accountHolder, final double balance) {
		super(accNo, accountHolder);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
}
