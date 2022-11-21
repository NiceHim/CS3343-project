package Test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;
import Othello.*;

public class ValidMovePositionFetchTest {

    @Test
    public void ValidMovePositionFetchTest1_1() {
        PositionMarker positionMarker = new PositionMarker();
        String testBoard[][] = {
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", "B", " ", " ", " "},
            {" ", " ", " ", " ", "B", " ", " ", " "},
            {" ", " ", " ", "W", "B", "W", " ", " "},
            {" ", " ", " ", "W", "W", "W", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        ChessFactory chessFactory = new ChessFactory();
        Grid[][] board = new Grid[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Grid(new Position(j, i), null);
                if (testBoard[i][j].equals(" ")) continue;
                board[i][j].setChess(chessFactory.getChess(testBoard[i][j].charAt(0)));
                positionMarker.addChessPosition(testBoard[i][j].charAt(0), new Position(j, i));
            }
        }
        ValidMovePositionFetch validMovePositionFetch = new ValidMovePositionFetch();
        validMovePositionFetch.findAllValidMovePosition('B', positionMarker.getAllChessPosition('B'), board);
        int result = validMovePositionFetch.countValidMovePositon();
        int expectedResult = 7;
        assertEquals(expectedResult, result);
    }

    @Test
    public void ValidMovePositionFetchTest1_2() {
        PositionMarker positionMarker = new PositionMarker();
        String testBoard[][] = {
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", "B", " ", " ", " "},
            {" ", " ", " ", " ", "B", " ", " ", " "},
            {" ", " ", " ", "W", "B", "W", " ", " "},
            {" ", " ", " ", "W", "W", "W", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        ChessFactory chessFactory = new ChessFactory();
        Grid[][] board = new Grid[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Grid(new Position(j, i), null);
                if (testBoard[i][j].equals(" ")) continue;
                board[i][j].setChess(chessFactory.getChess(testBoard[i][j].charAt(0)));
                positionMarker.addChessPosition(testBoard[i][j].charAt(0), new Position(j, i));
            }
        }
        ValidMovePositionFetch validMovePositionFetch = new ValidMovePositionFetch();
        validMovePositionFetch.findAllValidMovePosition('B', positionMarker.getAllChessPosition('B'), board);
        HashSet<Position> result = validMovePositionFetch.getValidMovePositions();
        HashSet<Position> expectedResult = new HashSet<Position>();
        expectedResult.add(new Position("C4"));
        expectedResult.add(new Position("G4"));
        expectedResult.add(new Position("C6"));
        expectedResult.add(new Position("C5"));
        expectedResult.add(new Position("E6"));
        expectedResult.add(new Position("G5"));
        expectedResult.add(new Position("G6"));
        assertEquals(expectedResult, result);
    }

    @Test
    public void ValidMoveFetchTest1_3() {
        PositionMarker positionMarker = new PositionMarker();
        String testBoard[][] = {
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", "B", " ", " ", " "},
            {" ", " ", " ", " ", "B", " ", " ", " "},
            {" ", " ", " ", "W", "B", "W", " ", " "},
            {" ", " ", " ", "W", "W", "W", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        ChessFactory chessFactory = new ChessFactory();
        Grid[][] board = new Grid[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Grid(new Position(j, i), null);
                if (testBoard[i][j].equals(" ")) continue;
                board[i][j].setChess(chessFactory.getChess(testBoard[i][j].charAt(0)));
                positionMarker.addChessPosition(testBoard[i][j].charAt(0), new Position(j, i));
            }
        }
        ValidMovePositionFetch validMovePositionFetch = new ValidMovePositionFetch();
        validMovePositionFetch.findAllValidMovePosition('B', positionMarker.getAllChessPosition('B'), board);
        int result = validMovePositionFetch.countValidMovePositon();
        int expectedResult = 7;
        assertEquals(expectedResult, result);
    }

    @Test
    public void ValidMoveFetchTest1_4() {
        PositionMarker positionMarker = new PositionMarker();
        String testBoard[][] = {
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", "B", " ", " ", " "},
            {" ", " ", " ", " ", "B", " ", " ", " "},
            {" ", " ", " ", "W", "B", "W", " ", " "},
            {" ", " ", " ", "W", "W", "W", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        ChessFactory chessFactory = new ChessFactory();
        Grid[][] board = new Grid[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Grid(new Position(j, i), null);
                if (testBoard[i][j].equals(" ")) continue;
                board[i][j].setChess(chessFactory.getChess(testBoard[i][j].charAt(0)));
                positionMarker.addChessPosition(testBoard[i][j].charAt(0), new Position(j, i));
            }
        }
        ValidMovePositionFetch validMovePositionFetch = new ValidMovePositionFetch();
        validMovePositionFetch.findAllValidMovePosition('B', positionMarker.getAllChessPosition('B'), board);
        boolean result = validMovePositionFetch.isEmptyValidMovePositon();
        boolean expectedResult = false;
        assertEquals(expectedResult, result);
    }

    @Test
    public void ValidMoveFetchTest1_5() {
        PositionMarker positionMarker = new PositionMarker();
        String testBoard[][] = {
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", "W", " ", " ", " "},
            {" ", " ", " ", " ", "W", " ", " ", " "},
            {" ", " ", " ", "W", "W", "W", " ", " "},
            {" ", " ", " ", "W", "W", "W", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        ChessFactory chessFactory = new ChessFactory();
        Grid[][] board = new Grid[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Grid(new Position(j, i), null);
                if (testBoard[i][j].equals(" ")) continue;
                board[i][j].setChess(chessFactory.getChess(testBoard[i][j].charAt(0)));
                positionMarker.addChessPosition(testBoard[i][j].charAt(0), new Position(j, i));
            }
        }
        ValidMovePositionFetch validMovePositionFetch = new ValidMovePositionFetch();
        validMovePositionFetch.findAllValidMovePosition('B', positionMarker.getAllChessPosition('B'), board);
        boolean result = validMovePositionFetch.isEmptyValidMovePositon();
        boolean expectedResult = true;
        assertEquals(expectedResult, result);
    }

    
}
