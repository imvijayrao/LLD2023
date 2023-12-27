package Case_study.TicTacToe.WinningStrategy;

import Case_study.TicTacToe.Models.Board;
import Case_study.TicTacToe.Models.Move;

public interface Winningstrategy {
    boolean checkWinner(Board board, Move move);
}
