package kata.bank.service;

import java.util.List;

import kata.bank.model.User;

public interface UserService {
	
	public User getUser(int idUser);
	
	public List<User> getAllUsers();

}
