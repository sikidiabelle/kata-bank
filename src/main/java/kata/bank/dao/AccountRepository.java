package kata.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import kata.bank.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
