package Othello;

import java.util.HashSet;

interface ValidMoveFetchService {
    public void findAllValidMovePosition(Character flag, HashSet<Position> chessPositions, Grid[][] board);
}
