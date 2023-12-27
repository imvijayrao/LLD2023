package Case_study.TicTacToe.Apprunner;

import Case_study.TicTacToe.Models.*;
import Case_study.TicTacToe.WinningStrategy.ColwinningStrategy;
import Case_study.TicTacToe.WinningStrategy.DiagonalwinningStrategy;
import Case_study.TicTacToe.WinningStrategy.RowwinningStrategy;
import Case_study.TicTacToe.WinningStrategy.Winningstrategy;
import Case_study.TicTacToe.controller.GameController;
import Case_study.TicTacToe.exceptions.DuplicateSymbolException;
import Case_study.TicTacToe.exceptions.MorethanOneBotException;
import Case_study.TicTacToe.exceptions.PlayerCountMismatchException;

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

        winningstrategies.add(new RowwinningStrategy());
        winningstrategies.add(new ColwinningStrategy());
        winningstrategies.add(new DiagonalwinningStrategy());

        Game game = gameController.startGame(dimension, Playerlist, winningstrategies);
        while(game.getGameState().equals(GameState.IN_PROG)){
            game.printBoard();
            gameController.makeMove(game);
        }

        if(GameState.SUCCESS.equals(game.getGameState())){
            game.printBoard();
            System.out.println(game.getWinner().getName()+", You have won the Game");
        }
        if(GameState.DRAW.equals(game.getGameState())){
            game.printBoard();
            System.out.println("-- Match tied --");
        }
    }
}
