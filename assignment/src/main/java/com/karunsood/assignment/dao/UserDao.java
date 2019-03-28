package com.karunsood.assignment.dao;

import java.util.List;

import com.karunsood.assignment.model.User;

public interface UserDao {
	
	void save(User user);
	User findByUsername(String username);
	List<User> getAllUsers();
}
