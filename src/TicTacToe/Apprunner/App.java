package TicTacToe.Apprunner;

import TicTacToe.Models.*;
import TicTacToe.WinningStrategy.Winningstrategy;
import TicTacToe.controller.GameController;
import TicTacToe.exceptions.DuplicateSymbolException;
import TicTacToe.exceptions.MorethanOneBotException;
import TicTacToe.exceptions.PlayerCountMismatchException;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws DuplicateSymbolException, MorethanOneBotException, PlayerCountMismatchException {
        GameController gameController = new GameController();

        int dimension = 3;
        List<Player> Playerlist = new ArrayList<>();
        List<Winningstrategy> winningstrategies = new ArrayList<>();

        Playerlist.add(new Player('X', "Vijay", 1, Playertype.HUMAN));
        Playerlist.add(new Bot('O', "GPT3.5", 2, Playertype.BOT, BotDifficultyLevel.EASY));

        Game game = gameController.startGame(dimension, Playerlist, winningstrategies);
        while(game.getGameState().equals(GameState.IN_PROG)){
            game.printBoard();
            gameController.makeMove(game);
        }

        if(GameState.SUCCESS.equals(game.getGameState())){
            System.out.println(game.getWinner().getName()+", You have won the Game");
        }
        if(GameState.DRAW.equals(game.getGameState())){
            System.out.println("-- Match tied --");
        }

    }
}
