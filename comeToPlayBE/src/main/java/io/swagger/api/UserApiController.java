package io.swagger.api;

import io.swagger.model.User;
import io.swagger.services.PasswordService;
import io.swagger.services.UserService;

import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-05T13:20:02.674Z")

@RestController
public class UserApiController implements UserApi {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordService passwordService;

    public ResponseEntity<Void> createUser(@ApiParam(value = "Create of user object" ,required=true )  @Valid @RequestBody User body) {
        // do some magic!
        userService.saveUser(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true ) @PathVariable("username") String username) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<User> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ",required=true ) @PathVariable("username") String username) {
        // do some magic!
        User user = userService.findUsername(username);
        return new ResponseEntity<User>(user,HttpStatus.OK);
    }

    public ResponseEntity<User> loginUser( @NotNull@ApiParam(value = "The user name for login", required = true) @RequestParam(value = "username", required = true) String username,
         @NotNull@ApiParam(value = "The password for login in clear text", required = true) @RequestParam(value = "password", required = true) String password) {
        // do some magic!
        ResponseEntity<User> ResponseEntityUser = getUserByName(username);
        if(ResponseEntityUser.getBody() != null) {
            User user = ResponseEntityUser.getBody();
            if(user.getPassword().equals(passwordService.encrypt(password)))
                return new ResponseEntity<User>(user,HttpStatus.OK);
            else
                return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Void> logoutUser() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateUser(@ApiParam(value = "name that need to be updated",required=true ) @PathVariable("username") String username,
        @ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody User body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
