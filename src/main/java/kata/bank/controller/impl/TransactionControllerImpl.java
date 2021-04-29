package kata.bank.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kata.bank.controller.TransactionController;
import kata.bank.model.Transaction;
import kata.bank.service.TransactionService;

@RestController
@RequestMapping("/transaction")
@CrossOrigin(origins = "http://localhost:4200")
public class TransactionControllerImpl implements TransactionController{

	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/{id}")
	public Transaction getTransaction(int id) throws Exception {
		Transaction transaction = transactionService.getTransaction(id);
		
		if(transaction != null) {
			return transaction;
		}
		else {
			throw new Exception("transaction introuvable");
		}
	}
	
	@GetMapping
	public List<Transaction> getAllTransaction() {
		return transactionService.getAllTransactions();
	}

	@PostMapping("/add")
	public Transaction addTransaction(@RequestBody Transaction transaction) {
		return transactionService.addTransaction(transaction);
	}

}
