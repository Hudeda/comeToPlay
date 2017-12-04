package io.swagger.services.Imp;

import io.swagger.model.Event;
import io.swagger.model.User;
import io.swagger.repositories.EventRepository;
import io.swagger.repositories.UserRepository;
import io.swagger.services.EventService;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository eventRepository;

    @Autowired
    UserRepository userRepository;
    @Override
    public String addEvent(Event event) {
        event.setDateCreated(LocalDateTime.now().toLocalDate());
        eventRepository.save(event);
        return event.getId();
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
    public boolean joinUserToEvent(String userId, String eventId) {
        Event event = getEventsByEventId(eventId);
        User user = userRepository.findOne(userId);
        if(event.getParticipants() != null)
            if(event.getParticipants().contains(user))
                return false;

        event.addParticipantsItem(user);
        eventRepository.save(event);
        return true;
    }

    @Override
    public List<Event> getAllEvents() {
        return (List<Event>) eventRepository.findAll();
    }
}
