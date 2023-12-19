package TicTacToe.WinningStrategy;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

public interface Winningstrategy {
    boolean checkWinner(Board board, Move move);
}
