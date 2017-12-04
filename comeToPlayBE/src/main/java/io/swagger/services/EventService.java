package io.swagger.services;

import io.swagger.model.Event;
import io.swagger.model.User;

import java.util.List;

public interface EventService {

    public String addEvent(Event event);

    public void deleteEventByEventId(String eventId);

    public Event getEventsByEventId(String eventId);

    public List<Event> getAllEvents();

    public boolean joinUserToEvent(String userId, String eventId);

}
