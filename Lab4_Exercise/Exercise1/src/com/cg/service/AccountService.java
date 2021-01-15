package com.cg.service;

import java.util.List;

import com.cg.domain.Account;
import com.cg.exception.InsufficientBalanceException;
import com.cg.exception.InvalidAccountNumberException;

public interface AccountService {

	int ACCOUNT_TYPE_SAVING_ACCOUNT = 1;
	int ACCOUNT_TYPE_CURRENT_TYPE = 2;
	
	void createAccount(int accType, String accountHolder);
	
	void depositeMoney(Long accNo, int accType, double amount) throws InvalidAccountNumberException;
	
	void withdrawMoney(Long accNo, int accType, double amount) throws InvalidAccountNumberException, InsufficientBalanceException;
	
	Account displayAccountStatus(Long accNo, int accType) throws InvalidAccountNumberException;
	
	List<Account> showAllAccounts();
	
	
}
