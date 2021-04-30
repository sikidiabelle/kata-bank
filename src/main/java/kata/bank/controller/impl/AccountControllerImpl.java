package kata.bank.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kata.bank.controller.AccountController;
import kata.bank.model.Account;
import kata.bank.model.Transaction;
import kata.bank.service.AccountService;
import kata.bank.service.TransactionService;

@RestController
@RequestMapping("/account")
@CrossOrigin(origins = "http://localhost:4200")
public class AccountControllerImpl implements AccountController{

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/{idAccount}")
	public Account getAccount(@PathVariable int idAccount) throws Exception {
		Account account  = accountService.getAccount(idAccount);
		if(account != null) {
			return account;
		}
		else {
			throw new Exception("compte introuvable");
		}
	}

	@GetMapping
	public List<Account> getAllAccount() {
		return accountService.getAllAccounts();
	}

	@PutMapping("/update")
	public Account updateAccount(@RequestBody Account account) {
		return accountService.updateAccount(account);
	}
	
	@PutMapping("/{idAccount}/addTransaction")
	public Account updateAccount(@PathVariable int idAccount, @RequestBody Transaction transaction) {
		Account account = accountService.getAccount(idAccount);
		account.setBalance(account.getBalance()+transaction.getMontant());
		transaction.setAccount(account);
		transactionService.addTransaction(transaction);
		return accountService.updateAccount(account);
	}

}
