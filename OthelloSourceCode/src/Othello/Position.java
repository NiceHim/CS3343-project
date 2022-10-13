package Othello;

public class Position {
    private int xCoordinate;
    private int yCoordinate;

    public Position(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    
    public Position(String strPosition) {
        this.xCoordinate = (int)strPosition.charAt(0)-65;
        this.yCoordinate = (int)strPosition.charAt(1)-49;
    }

    public int getId() {
        return Integer.parseInt(String.valueOf(this.yCoordinate)+String.valueOf(this.xCoordinate));
    }

    public int getXCoordinate() {
        return this.xCoordinate;
    }

    public int getYCoordinate() {
        return this.yCoordinate;
    }

    @Override
    public String toString() {
        return Character.toString(xCoordinate+65) + Integer.toString(yCoordinate+1);
    }

    @Override
	public int hashCode() {
	    return getId();
	}

    @Override
	public boolean equals(Object obj) {
		Position position = null;
	    if (obj instanceof Position) {
	        position = (Position)obj;
	    }
        return this.getId() == position.getId();
	}
}
