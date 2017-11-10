package io.swagger.repositories;

import io.swagger.model.Games;
import io.swagger.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GameRepository extends PagingAndSortingRepository<Games, String> {

}
