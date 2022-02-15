package com.collection.authusingmap;

import java.util.HashMap;
import java.util.Map;

public class PasswordManager {
	Map<String,String> users=null;
	PasswordManager(){
		users=new HashMap<>();
	}
	
	public void addUser(String username,String password) {
		if(!users.containsKey(username)) {
			users.put(username, password);
			System.out.println("User, "+username+" added successfully");
		}
		else {
			System.out.println("User Already Exist! Please Try again with new username");
		}
	}
	
	public void removeUser(String username,String password) {
		if(users.containsKey(username) && users.containsValue(password)) {
			users.remove(username);
			System.out.println("User+ "+username+" deleted successfully!");
		}
	}
	
	public boolean userLogin(String username,String password) {
		if(users.containsKey(username) && users.containsValue(password))
			return true;
		return false;
	}
}
