package io.swagger.repositories;

import io.swagger.model.Event;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EventRepository extends PagingAndSortingRepository<Event, String> {

}
