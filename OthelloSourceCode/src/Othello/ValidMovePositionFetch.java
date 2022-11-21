package Othello;


import java.util.HashMap;
import java.util.HashSet;

public class ValidMovePositionFetch implements ValidMovePositionFetchService{
    private ValidMoveCheckService validMoveCheckService;
    private HashSet<Position> validMovePositions;

    public ValidMovePositionFetch() {
        this.validMoveCheckService = new ValidMoveChecker();
        this.validMovePositions = new HashSet<Position>();
    }

    @Override
    public void findAllValidMovePosition(Character flag, HashSet<Position> chessPositions, Grid[][] board) {
        for (Position chessPosition : chessPositions) {
            HashMap<Position, int[]> results = this.validMoveCheckService.findValidMove(flag, chessPosition, board);
            this.validMovePositions.addAll(results.keySet());
        }
    }


    @Override
    public int countValidMovePositon() {
        return this.validMovePositions.size();
    }

    @Override
    public HashSet<Position> getValidMovePositions() {
        return this.validMovePositions;
    }

    @Override
    public boolean isEmptyValidMovePositon() {
        return countValidMovePositon() == 0 ? true : false;
    }
    
}
