package kata.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import kata.bank.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
