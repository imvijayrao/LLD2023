package TicTacToe.botplayingStrategy;

import TicTacToe.Models.Board;
import TicTacToe.Models.Cell;
import TicTacToe.Models.Cellstate;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Cell Makemove(Board board) {
        for(List<Cell> row: board.getBoard()){
            for(Cell cell: row){
                if(Cellstate.EMPTY.equals(cell.getCellstate())){
                    return cell;
                }
            }
        }
        return null;
    }
}
