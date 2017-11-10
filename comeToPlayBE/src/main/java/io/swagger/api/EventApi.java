/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Event;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-05T13:20:02.674Z")

@Api(value = "event", description = "the event API")
public interface EventApi {

    @ApiOperation(value = "Create event", notes = "", response = Void.class, tags={ "event", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    
    @RequestMapping(value = "/event/createEvent",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> addEvent(@ApiParam(value = "List of Event object" ,required=true )  @Valid @RequestBody Event body);


    @ApiOperation(value = "Get All Events", notes = "This can all user can use.", response = Event.class, responseContainer = "List", tags={ "event", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = Event.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Invalid Event supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Event not found", response = Void.class) })

    @RequestMapping(value = "/events",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<List<Event>> getAllEvents();


    @ApiOperation(value = "Delete Event", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "event", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Delete success", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid Event supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Event not found", response = Void.class) })
    
    @RequestMapping(value = "/event/{eventId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteEventByEventId(@ApiParam(value = "The id that needs to be delete this Event",required=true ) @PathVariable("eventId") String eventId);


    @ApiOperation(value = "Get One Event", notes = "This can all user can use.", response = Event.class, tags={ "event", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Event.class),
        @ApiResponse(code = 400, message = "Invalid Event supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Event not found", response = Void.class) })
    
    @RequestMapping(value = "/event/{eventId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Event> getEventsByEventId(@ApiParam(value = "The id that needs to get this Event",required=true ) @PathVariable("eventId") String eventId);

}