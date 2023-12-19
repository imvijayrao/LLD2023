package TicTacToe.botplayingStrategy;

import TicTacToe.Models.Board;
import TicTacToe.Models.Cell;

public interface BotPlayingStrategy {
    Cell Makemove(Board board);
}
