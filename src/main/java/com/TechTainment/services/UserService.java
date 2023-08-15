package com.TechTainment.services;

import java.util.List;

import com.TechTainment.entities.User;
public interface UserService {
	User createUser(User user);
	User updateUserByUsername(User user,String username);
	User getUserByUsername(String username);
	boolean deleteUserByUsername(String username);
	List<User> getAllUsers();
}
