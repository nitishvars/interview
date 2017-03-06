package com.example.repo;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.example.model.User;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

  /**
   * This method will find an User instance in the database by its email.
   * http://docs.spring.io/spring-data/data-jpa/docs/current/reference/html/#jpa.query-methods.query-creation
   */
  public User findByEmail(String email);

}
