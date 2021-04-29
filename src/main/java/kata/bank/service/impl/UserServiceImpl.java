package kata.bank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kata.bank.dao.UserRepository;
import kata.bank.model.User;
import kata.bank.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	public User getUser(int idUser) {
		return userRepository.findById(idUser).orElse(null);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	

}
