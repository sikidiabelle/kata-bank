package kata.bank.controller;

import java.util.List;

import kata.bank.model.Account;

public interface AccountController {
	
	public Account getAccount(int idAccount) throws Exception;
	
	public List<Account> getAllAccount();
	
	public Account updateAccount(Account account);

}
