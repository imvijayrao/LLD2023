package Case_study.TicTacToe.Models;

import Case_study.TicTacToe.WinningStrategy.Winningstrategy;
import Case_study.TicTacToe.exceptions.DuplicateSymbolException;
import Case_study.TicTacToe.exceptions.MorethanOneBotException;
import Case_study.TicTacToe.exceptions.PlayerCountMismatchException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private GameState gameState;
    private Player winner;
    private int nextPlayerIndex;
    private List<Winningstrategy> winningstrategies;

    private Game(int dimension, List<Player> players, List<Winningstrategy> winningstrategies){
        this.board = new Board(dimension);
        this.players = players;
        this.winningstrategies = winningstrategies;
        this.gameState = GameState.IN_PROG;
        this.nextPlayerIndex = 0;
        this.moves = new ArrayList<>();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void printBoard() {
        board.printBoard();
    }

    public void makemove(){
        Player player = players.get(nextPlayerIndex);
        Cell cell = player.makemove(board);
        Move move = new Move(cell, player);
        moves.add(move);

        if(checkWinner(move, board)){
            gameState = GameState.SUCCESS;
            winner = player;
            return;
        }

        if(moves.size() == board.getDimension()*board.getDimension()){
            gameState = GameState.DRAW;
            return;
        }

        nextPlayerIndex++;
        nextPlayerIndex = nextPlayerIndex%players.size();
    }

    private boolean checkWinner(Move move, Board board) {
        for(Winningstrategy winningstrategy: winningstrategies){
            if(winningstrategy.checkWinner(board,move)){
                return true;
            }
        }
        return false;
    }

    public static class Builder {
        private List<Player> players;
        private List<Winningstrategy> winningstrategies;
        private int dimension;

        private Builder(){
            this.players = new ArrayList<>();
            this.winningstrategies = new ArrayList<>();
            this.dimension = 0;
        }

        public Game build() throws MorethanOneBotException, DuplicateSymbolException, PlayerCountMismatchException {
            validateBotCount();
            validateUniqueSymbol();
            validateDimensionandPlayersCount();

            return new Game(dimension, players, winningstrategies);
        }

        private void validateDimensionandPlayersCount() throws PlayerCountMismatchException {
            if(players.size() != (dimension-1)){
                throw new PlayerCountMismatchException();
            }
        }

        private void validateUniqueSymbol() throws DuplicateSymbolException {
            Set<Character> symbols = new HashSet<>();

            for(Player player: players){
                if(symbols.contains(player.getSymbol())){
                    throw new DuplicateSymbolException();
                }
                else{
                    symbols.add(player.getSymbol());
                }
            }
        }

        private void validateBotCount() throws MorethanOneBotException {
            int botcount = 0;
            for(Player player: players){
                if(player.getPlayertype().equals(Playertype.BOT)){
                    botcount++;
                }
            }
            if(botcount>1){
                throw new MorethanOneBotException();
            }
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningstrategies(List<Winningstrategy> winningstrategies) {
            this.winningstrategies = winningstrategies;
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

}
