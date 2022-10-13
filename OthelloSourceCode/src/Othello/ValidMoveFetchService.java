package Othello;

import java.util.ArrayList;
import java.util.HashSet;

interface ValidMoveFetchService {
    public void findAllValidMovePosition(Character flag, HashSet<Position> chessPositions, Grid[][] board);
    public boolean isContainValidMovePosition(Position position);
    public int countValidMovePositon();
    public HashSet<Position> getValidMovePositions();
    public ArrayList<int[]> getValidMoveDirections(Position position);
}
