package kata.bank.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kata.bank.controller.UserController;
import kata.bank.model.User;
import kata.bank.service.UserService;

@RestController
@RequestMapping("/user")
public class UserControllerImpl implements UserController{
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable int id) throws Exception {
		User user = userService.getUser(id);
		if(user != null) {
			return user;
		}
		else {
			throw new Exception("Utilisateur introuvable");
		}
	}

	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

}
