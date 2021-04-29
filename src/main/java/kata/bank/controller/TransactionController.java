package kata.bank.controller;

import java.util.List;

import kata.bank.model.Transaction;

public interface TransactionController {
	
	public Transaction getTransaction(int idTransaction) throws Exception;
	
	public List<Transaction> getAllTransaction();
	
	public Transaction addTransaction(Transaction transaction);

}
