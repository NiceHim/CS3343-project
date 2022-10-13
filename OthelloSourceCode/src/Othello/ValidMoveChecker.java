package Othello;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class ValidMoveChecker implements ValidMoveCheckService {

    public ValidMoveChecker() {
    }

    public HashMap<Position, int[]> findValidMove(Character flag, Position position, Grid[][] board) {
        HashMap<Position, int[]> result = new HashMap<Position, int[]>();
        ArrayList<PositionDirection> validMovePositionDirections = checkEightDirection(flag, position, board);
        for (PositionDirection validMovePositionDirection : validMovePositionDirections) {
            result.put(validMovePositionDirection.getPosition(), validMovePositionDirection.getDirection());
        }
        return result;
    }

    public ArrayList<PositionDirection> checkEightDirection(Character flag, Position position, Grid[][] board) {
        ArrayList<PositionDirection> validMovePositionDirection = new ArrayList<PositionDirection>();
        int[][] oppositeDirection = {{0, 1}, {-1, 1}, {-1, 0}, {-1, -1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}};
        int[][] directions = {{0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}};
        final int[][] directionsDeepCopy = {{0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}};
        int xCoordinate = position.getXCoordinate();
        int yCoordinate = position.getYCoordinate();
        for (int i = 0; i < directions.length; i++) {
            for (int j = 1; j < 8; j++) {
                int deltaYCoordinate = yCoordinate+directions[i][1];
                int deltaXCoordinate = xCoordinate+directions[i][0];
                if (deltaYCoordinate == -1 || deltaXCoordinate == -1) {
                    break;
                }
                Chess chess = board[deltaYCoordinate][deltaXCoordinate].getChess();
                if (j == 1 && (chess == null || chess.getValue() == flag)) {
                    break;
                }
                if (chess == null) {
                    validMovePositionDirection.add(new PositionDirection(board[deltaYCoordinate][deltaXCoordinate].getPosition(), oppositeDirection[i]));
                    break;
                }
                if (chess.getValue() == flag) {
                    break;
                }
                directions[i][0] += directionsDeepCopy[i][0];
                directions[i][1] += directionsDeepCopy[i][1];
            }
            directions = new int[][] {{0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}};
        }
        return validMovePositionDirection;
    }


}
