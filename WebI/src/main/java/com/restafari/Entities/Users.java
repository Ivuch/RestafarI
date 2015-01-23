package com.restafari.Entities;

import java.util.List;

public class Users {

	List<User> registeredUsers;
	
	public Users(){}
	
	public List<User> getUsers(){
		return this.registeredUsers;
	}
	public void addUser(User user){
		this.registeredUsers.add(user);
	}
	
}
