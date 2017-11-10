package io.swagger.api;


import io.swagger.model.Event;
import io.swagger.annotations.*;

import io.swagger.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-05T13:20:02.674Z")

@Controller
public class EventApiController implements EventApi {

    @Autowired
    EventService eventService;

    public ResponseEntity<Void> addEvent(@ApiParam(value = "List of Event object" ,required=true )  @Valid @RequestBody Event body) {
        // do some magic!
        eventService.addEvent(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteEventByEventId(@ApiParam(value = "The id that needs to be delete this Event",required=true ) @PathVariable("eventId") String eventId) {
        // do some magic!
        eventService.deleteEventByEventId(eventId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Event> getEventsByEventId(@ApiParam(value = "The id that needs to get this Event",required=true ) @PathVariable("eventId") String eventId) {
        // do some magic!
        Event event = eventService.getEventsByEventId(eventId);
        return new ResponseEntity<Event>(HttpStatus.OK);
    }
    public ResponseEntity<List<Event>> getAllEvents() {
        // do some magic!
        List<Event> list = eventService.getAllEvents();
        return new ResponseEntity<List<Event>>(list,HttpStatus.OK);
    }
}
