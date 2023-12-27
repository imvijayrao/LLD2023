package Case_study.TicTacToe.Models;

import java.util.Scanner;

public class Player {
    private char symbol;
    private String name;
    private int id;
    private Playertype playertype;
    Scanner scanner;

    public Player(char symbol, String name, int id, Playertype playertype){
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.playertype = playertype;
        scanner = new Scanner(System.in);
    }
    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Playertype getPlayertype() {
        return playertype;
    }

    public void setPlayertype(Playertype playertype) {
        this.playertype = playertype;
    }

    public Cell makemove(Board board) {
        System.out.println(this.name + "It's your turn, enter row & column");
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        while(validateMove(row, column, board) == false){
            System.out.println(this.name+", Invalid Move, Please enter agin");
            row = scanner.nextInt();
            column = scanner.nextInt();
        }

        Cell cell = board.getBoard().get(row).get(column);
        cell.setCellstate(Cellstate.FILLED);
        cell.setPlayer(this);

        return cell;
    }


    private boolean validateMove(int row, int column, Board board) {
        if (row >= board.getDimension() || row < 0) {
            return false;
        }
        if (column >= board.getDimension() || column < 0) {
            return false;
        }
        if (!Cellstate.EMPTY.equals(board.getBoard().get(row).get(column).getCellstate())) {
            return false;
        }
        return true;
    }
}
