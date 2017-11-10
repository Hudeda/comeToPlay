package io.swagger.repositories;

import io.swagger.model.Message;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MessageRepository extends PagingAndSortingRepository<Message, String> {

}
