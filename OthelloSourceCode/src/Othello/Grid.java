package Othello;

public class Grid {
    private Position position;
    private Chess chess;

    public Grid(Position position, Chess chess) {
        this.position = position;
        this.chess = chess;
    }

    public void setChess(Chess chess) {
        this.chess = chess;
    }

    public Chess getChess() {
        return this.chess;
    }

    public Position getPosition() {
        return this.position;
    }

    @Override
    public String toString() {
        return this.chess == null ? " " : this.chess.getValue().toString();
    }
}
