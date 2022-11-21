package Othello;

import java.util.HashSet;

interface ValidMovePositionFetchService extends ValidMoveFetchService {
    public int countValidMovePositon();
    public HashSet<Position> getValidMovePositions();
    public boolean isEmptyValidMovePositon();
}
