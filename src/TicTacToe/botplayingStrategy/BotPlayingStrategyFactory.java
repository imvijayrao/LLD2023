package TicTacToe.botplayingStrategy;

import TicTacToe.Models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyforDifficultyLevel(BotDifficultyLevel botDifficultyLevel){
        return new EasyBotPlayingStrategy();
    }
}
