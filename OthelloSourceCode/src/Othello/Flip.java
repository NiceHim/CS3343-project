package Othello;

import java.util.ArrayList;

public class Flip {
    public Flip() {

    }

    public void flip(Character flag, Position position, Grid[][] board, PositionMarker positionMarker, ArrayList<int[]> directions) {
        int xCoordinate = position.getXCoordinate();
        int yCoordinate = position.getYCoordinate();
        ArrayList<int[]> validMoveDirections = directions;
        for (int[] validMoveDirection : validMoveDirections) {
            final int[] validMoveDirectionDeepCopy = new int[validMoveDirection.length];
            System.arraycopy(validMoveDirection, 0, validMoveDirectionDeepCopy, 0, validMoveDirection.length);
            Chess chess = board[yCoordinate+validMoveDirection[1]][xCoordinate+validMoveDirection[0]].getChess();
            while (chess.getValue() != flag) {
                positionMarker.removeChessPosition(chess.getValue(), new Position(xCoordinate+validMoveDirection[0], yCoordinate+validMoveDirection[1]));
                board[yCoordinate+validMoveDirection[1]][xCoordinate+validMoveDirection[0]].setChess(chess.filp());
                positionMarker.addChessPosition(flag, new Position(xCoordinate+validMoveDirection[0], yCoordinate+validMoveDirection[1]));
                validMoveDirection[0] += validMoveDirectionDeepCopy[0];
                validMoveDirection[1] += validMoveDirectionDeepCopy[1];
                chess = board[yCoordinate+validMoveDirection[1]][xCoordinate+validMoveDirection[0]].getChess();
            }
        }
    }
}