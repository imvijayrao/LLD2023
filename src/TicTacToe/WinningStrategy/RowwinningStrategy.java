package TicTacToe.WinningStrategy;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

public class RowwinningStrategy implements Winningstrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
