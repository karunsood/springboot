package com.karunsood.assignment.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karunsood.assignment.dao.UserDao;
import com.karunsood.assignment.dto.UserDto;
import com.karunsood.assignment.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserDao userDao;
	
    @Override
    public void save(User user) {
    	userDao.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		List<UserDto> users=new ArrayList<UserDto>();
		
		List<User> userList=userDao.getAllUsers();
		
		 for (int i = 0; i < userList.size(); i++) { 	
			 UserDto user=new UserDto();
			 User user1=userList.get(i);
			 user.setId(user1.getId()+"");
			 user.setUserName(user1.getUsername());
			 users.add(user);
	      }
		
		return users;
	}
}
