package Case_study.TicTacToe.Models;

public class Cell {
    private int row;
    private int col;
    private Cellstate cellstate;
    private Player player;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
        this.cellstate = Cellstate.EMPTY;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Cellstate getCellstate() {
        return cellstate;
    }

    public void setCellstate(Cellstate cellstate) {
        this.cellstate = cellstate;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void display(){
        if(Cellstate.FILLED.equals(cellstate)){
            System.out.print("| "+player.getSymbol()+" |");
        }
        else if(Cellstate.EMPTY.equals(cellstate)){
            System.out.print("| - |");
        }
    }
}
