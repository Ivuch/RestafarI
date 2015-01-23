package com.restafari.Entities;

public class User {

	private String user;
	private String name;
	private String lname;
	private String pass;
	private String email;
	private String age;
	
	public User(String user,String name,String lname,String pass,String email,String age){
		this.user = user;
		this.name = name;
		this.lname = lname;
		this.pass = pass;
		this.email = email;
		this.age = age;
	}
	public User(String user,String name,String lname,String pass,String email){
		this.user = user;
		this.name = name;
		this.lname = lname;
		this.pass = pass;
		this.email = email;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	
}
