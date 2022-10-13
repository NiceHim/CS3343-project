package Othello;

public class PositionDirection {
    private Position position;
    private int[] direction;

    public PositionDirection(Position position, int[] direction) {
        this.position = position;
        this.direction = direction;
    }

    public Position getPosition() {
        return this.position;
    }

    public int[] getDirection() {
        return this.direction;
    }
}
