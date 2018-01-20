package io.swagger.repositories;

import io.swagger.model.Event;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EventRepository extends PagingAndSortingRepository<Event, String> {
    List<Event> findAllByOrderByEventDateDesc();

}
