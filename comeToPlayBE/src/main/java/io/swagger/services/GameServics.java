package io.swagger.services;

import io.swagger.model.Games;

import java.util.List;

public interface GameServics {

    public void createGame(Games games);

    public void deleteGameByGameId(String gameId);

    public List<Games> getAllgames();

    public Games getOneGameByGameId(String gameId);
}
