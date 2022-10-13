package Othello;

import java.util.HashMap;

interface ValidMoveCheckService {
    public HashMap<Position, int[]> findValidMove(Character flag, Position position, Grid[][] board);
}
