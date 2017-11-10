package io.swagger.services;

import io.swagger.model.Event;

import java.util.List;

public interface EventService {

    public void addEvent(Event event);

    public void deleteEventByEventId(String eventId);

    public Event getEventsByEventId(String eventId);

    public List<Event> getAllEvents();

}
