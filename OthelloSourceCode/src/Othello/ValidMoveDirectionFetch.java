package Othello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ValidMoveDirectionFetch implements ValidMoveDirectionFetchService {
    private ValidMoveCheckService validMoveCheckService;
    private HashMap<Position, ArrayList<int[]>> validMovePositionDirections;

    public ValidMoveDirectionFetch() {
        this.validMoveCheckService = new ValidMoveChecker();
        this.validMovePositionDirections = new HashMap<Position, ArrayList<int[]>>();
    }

    @Override
    public void findAllValidMovePosition(Character flag, HashSet<Position> chessPositions, Grid[][] board) {
        for (Position chessPosition : chessPositions) {
            HashMap<Position, int[]> results = this.validMoveCheckService.findValidMove(flag, chessPosition, board);
            for (Map.Entry<Position, int[]> result : results.entrySet()) {
                if (this.validMovePositionDirections.containsKey(result.getKey())) {
                    this.validMovePositionDirections.get(result.getKey()).add(result.getValue());
                } else {
                    this.validMovePositionDirections.put(result.getKey(), new ArrayList<>(Arrays.asList(result.getValue())));
                }
            }
        }
        
    }

    @Override
    public boolean isContainValidMovePosition(Position position) {
        return validMovePositionDirections.containsKey(position);
    }

    @Override
    public ArrayList<int[]> getValidMoveDirections(Position position) {
        return validMovePositionDirections.get(position);
    }
    
}
