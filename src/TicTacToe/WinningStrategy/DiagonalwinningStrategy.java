package TicTacToe.WinningStrategy;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

import java.util.HashMap;
import java.util.Map;

public class DiagonalwinningStrategy implements Winningstrategy{
    Map<Character, Integer> leftDiagonalMap = new HashMap<>();
    Map<Character, Integer> righttDiagonalMap = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int column = move.getCell().getCol();
        char symbol = move.getPlayer().getSymbol();

        //checking winner via leftdiagonal
        if(row == column){
            if(!leftDiagonalMap.containsKey(symbol)){
                leftDiagonalMap.put(symbol,0);
            }
            leftDiagonalMap.put(symbol, leftDiagonalMap.get(symbol)+1);

            if(board.getDimension() == leftDiagonalMap.get(symbol)){
                System.out.println();
                return true;
            }
        }

        //checking winner via rightdiagonal
        if(row+column == board.getDimension()-1){
            if(!righttDiagonalMap.containsKey(symbol)){
                righttDiagonalMap.put(symbol,0);
            }
            righttDiagonalMap.put(symbol, righttDiagonalMap.get(symbol)+1);

            if(board.getDimension() == righttDiagonalMap.get(symbol)){
                System.out.println();
                return true;
            }
        }

        return false;
    }
}
