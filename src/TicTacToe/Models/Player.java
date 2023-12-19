package TicTacToe.Models;

public class Player {
    private char symbol;
    private String name;
    private int id;
    private Playertype playertype;

    public Player(char symbol, String name, int id, Playertype playertype){
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.playertype = playertype;
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
}
