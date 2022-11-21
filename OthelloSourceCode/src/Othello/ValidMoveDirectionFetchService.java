package Othello;

import java.util.ArrayList;

interface ValidMoveDirectionFetchService extends ValidMoveFetchService {
    public boolean isContainValidMovePosition(Position position);
    public ArrayList<int[]> getValidMoveDirections(Position position);
}
