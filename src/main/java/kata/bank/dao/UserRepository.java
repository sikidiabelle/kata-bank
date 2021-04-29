package kata.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import kata.bank.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
