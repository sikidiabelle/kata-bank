package kata.bank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kata.bank.dao.AccountRepository;
import kata.bank.model.Account;
import kata.bank.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	public AccountRepository accountRepository;
	
	public Account getAccount(int idAccount) {
		return accountRepository.findById(idAccount).orElse(null);
	}

	public List<Account> getAllAccounts() {
		return accountRepository.findAll();
	}

	public Account updateAccount(Account account) {
		Account accountTemp = accountRepository.findById(account.getIdAccount()).get();
		
		accountTemp.setBalance(account.getBalance());
		return accountRepository.save(accountTemp);
	}

}
