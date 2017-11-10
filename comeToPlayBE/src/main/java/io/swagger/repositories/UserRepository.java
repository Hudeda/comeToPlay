package io.swagger.repositories;

import io.swagger.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, String> {

  public User findUsersByUsername(String userName);
}
