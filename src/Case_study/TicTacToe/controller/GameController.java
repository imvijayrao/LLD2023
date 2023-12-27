package Case_study.TicTacToe.controller;

import Case_study.TicTacToe.Models.Game;
import Case_study.TicTacToe.Models.Player;
import Case_study.TicTacToe.WinningStrategy.Winningstrategy;
import Case_study.TicTacToe.exceptions.DuplicateSymbolException;
import Case_study.TicTacToe.exceptions.MorethanOneBotException;
import Case_study.TicTacToe.exceptions.PlayerCountMismatchException;

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
