package Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import Othello.*;

public class ValidMoveDirectionFetchTest {
    @Test
    public void ValidMoveDirectionFetch1_1() {
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
        ValidMoveDirectionFetch validMoveDirectionFetch = new ValidMoveDirectionFetch();
        validMoveDirectionFetch.findAllValidMovePosition('B', positionMarker.getAllChessPosition('B'), board);
        boolean result = validMoveDirectionFetch.isContainValidMovePosition(new Position("C4"));
        boolean expectedResult = true;
        assertEquals(expectedResult, result);
    }

    @Test
    public void ValidMoveDirectionFetch1_2() {
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
        ValidMoveDirectionFetch validMoveDirectionFetch = new ValidMoveDirectionFetch();
        validMoveDirectionFetch.findAllValidMovePosition('B', positionMarker.getAllChessPosition('B'), board);
        boolean result = validMoveDirectionFetch.isContainValidMovePosition(new Position("A1"));
        boolean expectedResult = false;
        assertEquals(expectedResult, result);
    }

    @Test
    public void ValidMoveDirectionFetch1_3() {
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
        ValidMoveDirectionFetch validMoveDirectionFetch = new ValidMoveDirectionFetch();
        validMoveDirectionFetch.findAllValidMovePosition('B', positionMarker.getAllChessPosition('B'), board);
        ArrayList<int[]> result = validMoveDirectionFetch.getValidMoveDirections(new Position("C4"));
        ArrayList<int[]> expectedResult = new ArrayList<>();
        expectedResult.add(new int[] {1, 0});
        assertArrayEquals(expectedResult.get(0), result.get(0));
    }

    @Test
    public void ValidMoveDirectionFetch1_4() {
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
        ValidMoveDirectionFetch validMoveDirectionFetch = new ValidMoveDirectionFetch();
        validMoveDirectionFetch.findAllValidMovePosition('B', positionMarker.getAllChessPosition('B'), board);
        ArrayList<int[]> result = validMoveDirectionFetch.getValidMoveDirections(new Position("A1"));
        ArrayList<int[]> expectedResult = null;
        assertEquals(expectedResult, result);
    }

    @Test
    public void ValidMoveFetchTest1_5() {
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
        ValidMoveDirectionFetch validMoveDirectionFetch = new ValidMoveDirectionFetch();
        validMoveDirectionFetch.findAllValidMovePosition('B', positionMarker.getAllChessPosition('B'), board);
        ArrayList<int[]> result = validMoveDirectionFetch.getValidMoveDirections(new Position("C4"));
        ArrayList<int[]> expectedResult = new ArrayList<int[]>();
        expectedResult.add(new int[] {1, 0});
        assertEquals(expectedResult.size(), result.size());
        for (int i = 0; i < expectedResult.size(); i++) {
            assertArrayEquals(expectedResult.get(i), result.get(i));
        }
    }
}
