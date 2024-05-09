package com.ss.assignment.userservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserServiceApplication {

	@Autowired
	private UserRepository userRepository;

	@PostMapping(path = "register-user")
	public @ResponseBody User registerUser(@RequestParam String name, @RequestParam String email) {
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		return userRepository.save(user);
	}

	@GetMapping(path= "getusers")
	public @ResponseBody Iterable<User> getUsers()
	{
		return userRepository.findAll();
	}

	@GetMapping(path= "getuser")
	public @ResponseBody Optional<User> getUsers(@RequestParam Integer id)
	{
		return userRepository.findById(id);
	}

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
}
