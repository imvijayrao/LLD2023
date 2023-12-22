package TicTacToe.Models;

import TicTacToe.botplayingStrategy.BotPlayingStrategy;
import TicTacToe.botplayingStrategy.BotPlayingStrategyFactory;

public class Bot extends Player{

    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(char symbol, String name, int id, Playertype playertype, BotDifficultyLevel botDifficultyLevel) {
        super(symbol, name, id, playertype);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyforDifficultyLevel(botDifficultyLevel);
    }

    @Override
    public Cell makemove(Board board){
        System.out.println("Bot is gonna make a move");
        Cell cell = botPlayingStrategy.Makemove(board);
        cell.setCellstate(Cellstate.FILLED);
        cell.setPlayer(this);
        return cell;
    }
}
