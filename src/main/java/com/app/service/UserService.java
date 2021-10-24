package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Address;
import com.app.model.User;
import com.app.repository.UserRepositoy;

@Service
public class UserService {
	
	@Autowired
	private UserRepositoy userDB;
	
	public List<User> getUsers(){
		var users = new ArrayList<User>();
		userDB.findAll().forEach(users :: add);
		return users;
	}
	
	public Object getUserById(int id){
		Object retObject = userDB.findById(id);
		if(retObject == null)
			return "User with ID:("+id+") does not exist in Database";
		else 
		return retObject;
	}
	
	public String getUserByEmail(String email){
		if(userDB.findByEmail(email)) {
			return "User with Email:("+email+") exist in Database";
		}
		else {
			return "User with Email:("+email+") does not exist in Database";
		}
	}

	public User createUser(User user) {
		return userDB.save(user);
	}

	public void updateUser(User user) {
		userDB.save(user);
	}

	public void deleteUser(int id) {
		userDB.deleteById(id);
	}

	public void updateAddress(Address address, int id) {
		var user = userDB.findById(id).get();
		var oldAddress = user.getAddress();
		user.setArchivedAddress(oldAddress);
		user.setAddress(address);
		userDB.save(user);
	}
}
