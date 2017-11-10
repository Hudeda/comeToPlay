package io.swagger.api;


import io.swagger.model.Games;
import io.swagger.annotations.*;

import io.swagger.services.GameServics;
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
public class GameApiController implements GameApi {

    @Autowired
    GameServics gameService;

    public ResponseEntity<Void> createGame(@ApiParam(value = "List of Games object" ,required=true )  @Valid @RequestBody Games body) {
        // do some magic!
        gameService.createGame(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteGameByGameId(@ApiParam(value = "The id that needs to be delete this Game",required=true ) @PathVariable("gameId") String gameId) {
        // do some magic!
        gameService.deleteGameByGameId(gameId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Games>> getAllgames() {
        // do some magic!
        List<Games> list = gameService.getAllgames();
        return new ResponseEntity<List<Games>>(list,HttpStatus.OK);
    }

    public ResponseEntity<Games> getOneGameByGameId(@ApiParam(value = "The id that needs to get this Game",required=true ) @PathVariable("gameId") String gameId) {
        // do some magic!
        Games game = gameService.getOneGameByGameId(gameId);
        return new ResponseEntity<Games>(game,HttpStatus.OK);
    }

}
