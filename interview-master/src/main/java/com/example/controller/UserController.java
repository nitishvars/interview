package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.User;
import com.example.model.UserSearch;
import com.example.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	/**
	   * /create  --> Create a new user and save it in the database.
	   * 
	   * @param User POJO 
	   * @return A string describing if the user is successfully created or not.
	*/
	// or     @RequestMapping(method=RequestMethod.PUT)
	@RequestMapping("/create")
	@ResponseBody
	public String create(User user) {
		log.info("/create request received with param " + user);
	    try {
	    	userService.save(user);
	    }catch (Exception ex) {
	    	log.error("/create request responded with error "+ ex.getMessage());
	    	return "Error creating the user: " + ex.toString();
	    }
	    
	    return "User succesfully created! (id = " + user.getId() + ")";
	 }
	  
	
	/**
	   * /delete  --> Delete the user having the passed id.
	   * 
	   * @param id The id of the user to delete
	   * @return A string describing if the user is successfully deleted or not.
	*/
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(long id) {
		log.info("/delete request received with id " + id);
	    try {
	      UserSearch user = new UserSearch();
	      user.setId(id);
	      userService.delete(user);
	    }
	    catch (Exception ex) {
	    	log.error("/delete request responded with error "+ ex.getMessage());
	    	return "Error deleting the user: " + ex.toString();
	    }
	    return "User succesfully deleted!";
	}
	  
	/**
	   * /get  --> Return the user details for the user.
	   * 
	   * @param id To search in the database.
	   * @return The user id or a message error if the user is not found.
	*/
	@RequestMapping("/get")
	@ResponseBody
	public User getByEmail(@RequestParam(value="id", required=false, defaultValue="") Long id) {
		log.info("/get request received with id " + id);
		User user;
	    try {
	      UserSearch userSearch = new UserSearch();
	      userSearch.setId(id);
	      user = userService.getById(userSearch);
	    }
	    catch (Exception ex) {
	    	log.error("/get request responded with error "+ ex.getMessage());
	    	return null;
	    }
	    return user;
	}
	  
	/**
	   * /update  --> Update the user details 
	   * Params which can be updated are password, mobileNumber, college, company
	   * 
	   * @param user.id To uniquely identify user
	   * @param user.<param> The new value of param
	   * @return A string describing if the user is successfully updated or not.
	*/
	@RequestMapping("/update")
	@ResponseBody
	public String updateUser(User user) {
	    try {
	      userService.update(user);
	    }
	    catch (Exception ex) {
	      return "Error updating the user: " + ex.toString();
	    }
	    return "User succesfully updated!";
	}
}
