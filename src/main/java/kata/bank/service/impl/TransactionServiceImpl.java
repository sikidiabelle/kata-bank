package kata.bank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kata.bank.dao.TransactionRepository;
import kata.bank.model.Transaction;
import kata.bank.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	TransactionRepository transactionRepository;

	public Transaction getTransaction(int idTransaction) {
		return transactionRepository.findById(idTransaction).orElse(null);
	}

	public List<Transaction> getAllTransactions() {
		return transactionRepository.findAll();
	}

	public Transaction addTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}

}
