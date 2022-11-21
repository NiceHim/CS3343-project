package Othello;

import java.util.ArrayList;
import java.util.HashSet;

public class GameBoard {
    private ValidMovePositionFetchService validMovePositionFetchService;
    private ValidMoveDirectionFetchService validMoveDirectionFetchService;
    private PositionMarker positionMarker;
    private ChessFactory chessFactory;
    private Grid[][] board;

    public GameBoard() {
        this.board = new Grid[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.board[i][j] = new Grid(new Position(j, i), null);
            }
        }
        this.chessFactory = new ChessFactory();
        this.positionMarker = new PositionMarker();
        this.board[3][3].setChess(new WhiteChess());
        this.board[3][4].setChess(new BlackChess());
        this.board[4][3].setChess(new BlackChess());
        this.board[4][4].setChess(new WhiteChess());
        this.positionMarker.addChessPosition('B', new Position(3, 4));
        this.positionMarker.addChessPosition('B', new Position(4, 3));
        this.positionMarker.addChessPosition('W', new Position(3, 3));
        this.positionMarker.addChessPosition('W', new Position(4, 4));
    }

    public GameBoard(String board[][]) {
        this.chessFactory = new ChessFactory();
        this.positionMarker = new PositionMarker();
        this.board = new Grid[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.board[i][j] = new Grid(new Position(j, i), null);
                if (board[i][j].equals(" ")) continue;
                this.board[i][j].setChess(this.chessFactory.getChess(board[i][j].charAt(0)));
                this.positionMarker.addChessPosition(board[i][j].charAt(0), new Position(j, i));
            }
        }
    }

    public Grid[][] getBoard() {
        return this.board;
    }

    public void addChess(Character flag, Position position) {
        int xCoordinate = position.getXCoordinate();
        int yCoordinate = position.getYCoordinate();
        this.board[yCoordinate][xCoordinate].setChess(this.chessFactory.getChess(flag));
        this.positionMarker.addChessPosition(flag, position);
        new Flip().flip(flag, position, this.board, this.positionMarker, this.getValidMoveDirections(position));
    }

    public boolean isContainValidMovePosition(Position position) {
        return this.validMoveDirectionFetchService.isContainValidMovePosition(position);
    }

    public void findAllValidMovePositionAndDirection(Character flag) {
        this.validMovePositionFetchService = new ValidMovePositionFetch();
        this.validMoveDirectionFetchService = new ValidMoveDirectionFetch();
        this.validMovePositionFetchService.findAllValidMovePosition(flag, this.positionMarker.getAllChessPosition(flag), this.board);
        this.validMoveDirectionFetchService.findAllValidMovePosition(flag, this.positionMarker.getAllChessPosition(flag), this.board);
    }

    public HashSet<Position> getValidMovePositions() {
        return this.validMovePositionFetchService.getValidMovePositions();
    }

    public ArrayList<int[]> getValidMoveDirections(Position position) {
        return this.validMoveDirectionFetchService.getValidMoveDirections(position);
    }

    public HashSet<Position> getAllChessPosition(Character flag) {
        return this.positionMarker.getAllChessPosition(flag);
    }

    public boolean isEmptyValidMovePositon() {
        return this.validMovePositionFetchService.isEmptyValidMovePositon();
    }

    public int countBlackChess() {
        return this.positionMarker.countBlackChess();
    }

    public int countWhiteChess() {
        return this.positionMarker.countWhiteChess();
    }

}

