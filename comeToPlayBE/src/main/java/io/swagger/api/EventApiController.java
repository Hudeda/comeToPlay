package io.swagger.api;


import io.swagger.model.Event;
import io.swagger.annotations.*;

import io.swagger.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-05T13:20:02.674Z")

@RestController
public class EventApiController implements EventApi {

    @Autowired
    EventService eventService;

    public ResponseEntity<String> addEvent(@ApiParam(value = "List of Event object" ,required=true )  @Valid @RequestBody Event body) {
        // do some magic!
        String eventId = eventService.addEvent(body);
        return new ResponseEntity<String>(eventId,HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteEventByEventId(@ApiParam(value = "The id that needs to be delete this Event",required=true ) @PathVariable("eventId") String eventId) {
        // do some magic!
        eventService.deleteEventByEventId(eventId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Event> getEventsByEventId(@ApiParam(value = "The id that needs to get this Event",required=true ) @PathVariable("eventId") String eventId) {
        // do some magic!
        Event event = eventService.getEventsByEventId(eventId);
        return new ResponseEntity<Event>(event,HttpStatus.OK);
    }


    public ResponseEntity<Void> joinUserToEvent( @NotNull@ApiParam(value = "event that user want to join", required = true) @RequestParam(value = "eventId", required = true) String eventId,
                                                @NotNull@ApiParam(value = "id of usrt thst join to event", required = true) @RequestParam(value = "userId", required = true) String userId) {
        // do some magic!
        boolean asSave = eventService.joinUserToEvent(userId,eventId);
        if(asSave)
            return new ResponseEntity<Void>(HttpStatus.OK);
        return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Event>> getAllEvents() {
        // do some magic!
        List<Event> list = eventService.getAllEvents();
        return new ResponseEntity<List<Event>>(list,HttpStatus.OK);
    }
}
