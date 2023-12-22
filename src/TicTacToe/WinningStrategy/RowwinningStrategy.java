package TicTacToe.WinningStrategy;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

import java.util.HashMap;
import java.util.Map;

public class RowwinningStrategy implements Winningstrategy{
    Map<Integer, Map<Character, Integer>> map = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        char symbol = move.getPlayer().getSymbol();
        if(!map.containsKey(row)){
            map.put(row,new HashMap<>());
        }
        Map<Character, Integer> rowMap = map.get(row);
        if(!rowMap.containsKey(symbol)){
            rowMap.put(symbol,0);
        }

        //update the symbol count
        rowMap.put(symbol,rowMap.get(symbol)+1);

        //checking size of board equals symbol count
        if(board.getBoard().size() == rowMap.get(symbol)){
            return true;
        }

        return false;
    }
}
