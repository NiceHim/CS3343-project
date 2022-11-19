package Othello;

public class PositionDirection extends Position {
    private int[] direction;

    public PositionDirection(int xCoordinate, int yCoordinate, int[] direction) {
        super(xCoordinate, yCoordinate);
        this.direction = direction;
    }

    public PositionDirection(String strPosition, int[] direction) {
        super(strPosition);
        this.direction = direction;
    }
    
    public int[] getDirection() {
        return this.direction;
    }
}
