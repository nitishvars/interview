package com.example.service;

import com.example.model.User;
import com.example.model.UserSearch;

public interface UserService {

	void save(User user);

	void delete(UserSearch user);

	void update(User user);

	User getById(UserSearch userSearch);

}
