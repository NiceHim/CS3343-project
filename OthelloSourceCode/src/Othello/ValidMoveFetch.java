package Othello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ValidMoveFetch implements ValidMoveFetchService {
    private ValidMoveCheckService validMoveCheckService;
    private HashSet<Position> validMovePositions;
    private HashMap<Position, ArrayList<int[]>> validMovePositionDirections;

    public ValidMoveFetch() {
        this.validMoveCheckService = new ValidMoveChecker();
        this.validMovePositions = new HashSet<Position>();
        this.validMovePositionDirections = new HashMap<Position, ArrayList<int[]>>();
    }

    public void findAllValidMovePosition(Character flag, HashSet<Position> chessPositions, Grid[][] board) {
        for (Position chessPosition : chessPositions) {
            HashMap<Position, int[]> results = this.validMoveCheckService.findValidMove(flag, chessPosition, board);
            this.validMovePositions.addAll(results.keySet());
            for (Map.Entry<Position, int[]> result : results.entrySet()) {
                if (this.validMovePositionDirections.containsKey(result.getKey())) {
                    this.validMovePositionDirections.get(result.getKey()).add(result.getValue());
                } else {
                    this.validMovePositionDirections.put(result.getKey(), new ArrayList<>(Arrays.asList(result.getValue())));
                }
            }
        }
    }
    
    public int countValidMovePositon() {
        return this.validMovePositions.size();
    }

    public boolean isContainValidMovePosition(Position position) {
        return validMovePositionDirections.containsKey(position);
    }

    public HashSet<Position> getValidMovePositions() {
        return this.validMovePositions;
    }

    public ArrayList<int[]> getValidMoveDirections(Position position) {
        return validMovePositionDirections.get(position);
    }

}