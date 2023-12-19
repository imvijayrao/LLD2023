package TicTacToe.Models;

public class Bot extends Player{

    private BotDifficultyLevel botDifficultyLevel;


    public Bot(char symbol, String name, int id, Playertype playertype, BotDifficultyLevel botDifficultyLevel) {
        super(symbol, name, id, playertype);
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
