package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Address;
import com.app.model.User;
import com.app.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	//Create user:: not in task list
	@PostMapping( "/createUser")
	public void createUser(@RequestBody User user) {
		 userService.createUser(user);
	}
	
	
	//a. UpsertUser API to update user if exists else create a new
	@PutMapping("/UpsertUser")
	public void updateUser(@RequestBody User user) {
		 userService.updateUser(user);
	}
	
	//b. IsUserExists API which takes input as email and returns appropriate status
	@GetMapping("/IsUserExists/{email}")
	public String getUser(@PathVariable String email) {
		return userService.getUserByEmail(email);
	}
	
	//c. ListUsers API to return list of all users
	@GetMapping("/ListUsers")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	//d. GetUserDetails API inputs user id and returns user details including address.
	@GetMapping("/GetUserDetails/{user_id}")
	public Object getUser(@PathVariable int user_id) {	
		return userService.getUserById(user_id);
	}
	
	//e. DeleteUser API which takes user id and marks the user as deleted.
	@DeleteMapping("/DeleteUser/{user_id}")
	public void updateUser(@PathVariable int user_id) {
		userService.deleteUser(user_id);
	}
		
	//f. UpdateAddress API which takes user id and updates user address such that the old address is archived.
	@PutMapping("/UpdateAddress/{user_id}")
	public void updateAddress(@RequestBody  Address address, @PathVariable int user_id) {
		userService.updateAddress(address,user_id);
	}
	
}
