package Othello;

import java.util.HashSet;
import java.util.HashMap;

public class PositionMarker {
    private HashMap<Character, HashSet<Position>> chessPositionHashMap;
    
    public PositionMarker() {
        this.chessPositionHashMap = new HashMap<Character, HashSet<Position>>();
        this.chessPositionHashMap.put('B', new HashSet<Position>());
        this.chessPositionHashMap.put('W', new HashSet<Position>());
    }

    public int countBlackChess() {
        return this.chessPositionHashMap.get('B').size();
    }

    public int countWhiteChess() {
        return this.chessPositionHashMap.get('W').size();
    }

    public HashSet<Position> getAllChessPosition(Character flag) {
        return this.chessPositionHashMap.get(flag);
    }

    public void addChessPosition(Character flag, Position position) {
        this.chessPositionHashMap.get(flag).add(position);
    }

    public void removeChessPosition(Character flag, Position position) {
        this.chessPositionHashMap.get(flag).remove(position);
    }

}
