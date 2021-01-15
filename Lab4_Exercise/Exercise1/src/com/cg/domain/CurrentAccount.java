/**
 * This CurrentAccount will be used as date traveller object
 * 
 * @author rutuja pise
 */

package com.cg.domain;

public class CurrentAccount extends Account{
	/**
	 * overDraftLimit of current account
	 */
	private double overDraftLimit;

	/**
	 * Constructor of CurrentAccount class
	 * @param accNo
	 * @param accountHolder
	 * @param overDraftLimit
	 */
	public CurrentAccount(final Long accNo, final String accountHolder, final double overDraftLimit) {
		super(accNo, accountHolder);
		this.overDraftLimit = overDraftLimit;
	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}
	
	
}
