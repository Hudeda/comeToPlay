package io.swagger.services.Imp;

import io.swagger.model.User;
import io.swagger.repositories.UserRepository;
import io.swagger.services.PasswordService;
import io.swagger.services.UserService;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordService passwordService;

    public void saveUser(User user){
        user.setDateCreated(LocalDate.now());
        user.setPassword(passwordService.encrypt(user.getPassword()));
        userRepository.save(user);
    }

  @Override
  public User findUsername(String userName) {
    return userRepository.findUsersByUsername(userName);
  }

}
