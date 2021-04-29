package kata.bank.service;

import java.util.List;

import kata.bank.model.Account;

public interface AccountService {

	public Account getAccount(int idAccount);
	
	public List<Account> getAllAccounts();
	
	public Account updateAccount(Account account);
	
}
