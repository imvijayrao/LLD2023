package TicTacToe.controller;

import TicTacToe.Models.Game;
import TicTacToe.Models.Player;
import TicTacToe.WinningStrategy.Winningstrategy;
import TicTacToe.exceptions.DuplicateSymbolException;
import TicTacToe.exceptions.MorethanOneBotException;
import TicTacToe.exceptions.PlayerCountMismatchException;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> Playerlist, List<Winningstrategy> winningstrategies) throws DuplicateSymbolException, MorethanOneBotException, PlayerCountMismatchException {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(Playerlist)
                .setWinningstrategies(winningstrategies)
                .build();
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public void makeMove(Game game) {
        game.makemove();
    }
}
