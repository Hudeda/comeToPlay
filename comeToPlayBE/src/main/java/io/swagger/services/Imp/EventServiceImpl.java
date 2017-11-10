package io.swagger.services.Imp;

import io.swagger.model.Event;
import io.swagger.repositories.EventRepository;
import io.swagger.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository eventRepository;
    @Override
    public void addEvent(Event event) {
        eventRepository.save(event);
    }

    @Override
    public void deleteEventByEventId(String eventId) {
        eventRepository.delete(eventId);
    }

    @Override
    public Event getEventsByEventId(String eventId) {
        return eventRepository.findOne(eventId);
    }

    @Override
    public List<Event> getAllEvents() {
        return (List<Event>) eventRepository.findAll();
    }
}
