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
}
