package io.swagger.api;

import io.swagger.model.Message;

import io.swagger.annotations.*;

import io.swagger.services.MessageService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-05T13:20:02.674Z")

@RestController
public class MessageApiController implements MessageApi {

    @Autowired
    MessageService messageService;

    public ResponseEntity<Void> createMessage(@ApiParam(value = "List of mssages object" ,required=true )  @Valid @RequestBody Message body) {
        messageService.createMessage(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteMessageByMessageId(@ApiParam(value = "The id that needs to be delete this Message",required=true ) @PathVariable("messageId") String messageId) {
        // do some magic!
        messageService.deleteMessageByMessageId(messageId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Message>> getAllMessages() {
        // do some magic!
        List<Message> list = (List<Message>) messageService.getAllMessages();
        return new ResponseEntity<List<Message>>(list,HttpStatus.OK);
    }

    public ResponseEntity<Message> getOneMessageByMessageId(@ApiParam(value = "The id that needs to get this Message",required=true ) @PathVariable("messageId") String messageId) {
        // do some magic!
        Message message = messageService.getMessageById(messageId);
        return new ResponseEntity<Message>(message,HttpStatus.OK);
    }

}
