package kata.bank.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import kata.bank.model.User;

@RestController
public interface UserController {
	
	public User getUser(int idUser) throws Exception;
	
	public List<User> getAllUsers();

}
