package kata.bank.service;

import java.util.List;

import kata.bank.model.Transaction;

public interface TransactionService {
	
	public Transaction getTransaction(int idTransaction);
	
	public List<Transaction> getAllTransactions();
	
	public Transaction addTransaction(Transaction transaction);

}
