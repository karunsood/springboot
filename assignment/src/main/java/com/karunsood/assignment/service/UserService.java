package com.karunsood.assignment.service;

import java.util.List;

import com.karunsood.assignment.dto.UserDto;
import com.karunsood.assignment.model.User;

public interface UserService {
	
    void save(User user);

    User findByUsername(String username);
    
    List<UserDto> getAllUsers();
}
