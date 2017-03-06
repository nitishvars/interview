package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.User;
import com.example.model.UserSearch;
import com.example.model.UserUpdatePass;
import com.example.repo.UserDao;

public class UserServiceImpl implements UserService{


	@Autowired
	private UserDao userDao;
	
	@Override
	public void save(User user) {
		userDao.save(user);		
	}

	@Override
	public void delete(UserSearch user) {
		userDao.delete(user.getId());
	}

	@Override
	public User getById(UserSearch userSearch) {
		return userDao.findOne(userSearch.getId());
	}
	
	@Override
	public void update(User user) {
		User userExistingDetails = userDao.findOne(user.getId());
		if(userExistingDetails==null){
			// throw error
		}else{
			
		}
	}

	// A new method for additional security
	// Method validates current password and then update new password
	@Override
	public void updatePassword(UserUpdatePass user) {
		// TODO Auto-generated method stub
		
	}

}
