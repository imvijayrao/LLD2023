package Case_study.TicTacToe.WinningStrategy;

import Case_study.TicTacToe.Models.Board;
import Case_study.TicTacToe.Models.Game;
import Case_study.TicTacToe.Models.Move;

import java.util.HashMap;
import java.util.Map;

public class ColwinningStrategy implements Winningstrategy{
    Map<Integer, Map<Character, Integer>> map = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int column = move.getCell().getCol();
        char symbol = move.getPlayer().getSymbol();
        if(!map.containsKey(column)){
            map.put(column,new HashMap<>());
        }
        Map<Character, Integer> columnmap = map.get(column);
        if(!columnmap.containsKey(symbol)){
            columnmap.put(symbol,0);
        }

        //update the symbol count
        columnmap.put(symbol,columnmap.get(symbol)+1);

        //checking size of board equals symbol count
        if(board.getBoard().size() == columnmap.get(symbol)){
            return true;
        }

        return false;
    }
}
