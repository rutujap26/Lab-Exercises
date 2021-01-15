package com.cg.serviceimpl;

import java.util.List;

import com.cg.domain.Account;
import com.cg.domain.CurrentAccount;
import com.cg.domain.SavingsAccount;
import com.cg.exception.InsufficientBalanceException;
import com.cg.exception.InvalidAccountNumberException;
import com.cg.service.AccountService;

public class AccountServiceImpl implements AccountService {
	
	private List<Account> accountRepository;

	@Override
	public void createAccount(int accType, String accountHolder) {
		Account newAccount = null;
		Long newAccountNumber = System.currentTimeMillis();
		double openingBalance;
		if(accType==AccountService.ACCOUNT_TYPE_SAVING_ACCOUNT) {
			openingBalance = 500;
			newAccount = new SavingsAccount(newAccountNumber, accountHolder, openingBalance);
		}
		if(accType==AccountService.ACCOUNT_TYPE_CURRENT_TYPE) {
			openingBalance = 5000;
			newAccount = new CurrentAccount(newAccountNumber, accountHolder, openingBalance);
		}
		accountRepository.add(newAccount);
	}

	@Override
	public void depositeMoney(Long accNo, int accType, double amount) throws InvalidAccountNumberException {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdrawMoney(Long accNo, int accType, double amount)
			throws InvalidAccountNumberException, InsufficientBalanceException {
		// TODO Auto-generated method stub

	}

	@Override
	public Account displayAccountStatus(Long accNo, int accType) throws InvalidAccountNumberException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> showAllAccounts() {
		
		return accountRepository;
	}

}
