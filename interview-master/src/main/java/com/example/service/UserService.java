package com.example.service;

import com.example.model.User;
import com.example.model.UserSearch;
import com.example.model.UserUpdatePass;

public interface UserService {

	void save(User user);

	void delete(UserSearch user);

	void update(User user);

	User getById(UserSearch userSearch);

	void updatePassword(UserUpdatePass user);

}
