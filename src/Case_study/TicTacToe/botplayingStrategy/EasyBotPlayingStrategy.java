package Case_study.TicTacToe.botplayingStrategy;

import Case_study.TicTacToe.Models.Board;
import Case_study.TicTacToe.Models.Cell;
import Case_study.TicTacToe.Models.Cellstate;

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
