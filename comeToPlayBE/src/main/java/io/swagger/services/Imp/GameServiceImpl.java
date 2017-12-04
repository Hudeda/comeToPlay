package io.swagger.services.Imp;

import io.swagger.model.Games;
import io.swagger.repositories.GameRepository;
import io.swagger.services.GameServics;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameServics {

    GameRepository gameRepository;

    @Override
    public void createGame(Games games) {
        games.setGameTime(new DateTime());
        games.getCreater().setDateCreated(LocalDate.now());
        gameRepository.save(games);
    }

    @Override
    public void deleteGameByGameId(String gameId) {
        gameRepository.delete(gameId);
    }

    @Override
    public List<Games> getAllgames() {
        return (List<Games>) gameRepository.findAll();
    }

    @Override
    public Games getOneGameByGameId(String gameId) {
        return gameRepository.findOne(gameId);
    }
}
