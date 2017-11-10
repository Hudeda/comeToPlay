package io.swagger.services;


import io.swagger.model.User;

public interface UserService {

  public void saveUser(User user);

  public User findUsername(String userName);

}
