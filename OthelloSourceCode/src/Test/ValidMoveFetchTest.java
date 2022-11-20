package Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Test;

import Othello.*;

public class ValidMoveFetchTest {

    // public static void main(String[] args) {
    //     PositionMarker positionMarker = new PositionMarker();
    //     String testBoard[][] = {
    //         {" ", " ", " ", " ", " ", " ", " ", " "},
    //         {" ", " ", " ", " ", "B", " ", " ", " "},
    //         {" ", " ", " ", " ", "B", " ", " ", " "},
    //         {" ", " ", " ", "W", "B", "W", " ", " "},
    //         {" ", " ", " ", "W", "W", "W", " ", " "},
    //         {" ", " ", " ", " ", " ", " ", " ", " "},
    //         {" ", " ", " ", " ", " ", " ", " ", " "},
    //         {" ", " ", " ", " ", " ", " ", " ", " "},
    //     };
    //     ChessFactory chessFactory = new ChessFactory();
    //     Grid[][] board = new Grid[8][8];
    //     for (int i = 0; i < 8; i++) {
    //         for (int j = 0; j < 8; j++) {
    //             board[i][j] = new Grid(new Position(j, i), null);
    //             if (testBoard[i][j].equals(" ")) continue;
    //             board[i][j].setChess(chessFactory.getChess(testBoard[i][j].charAt(0)));
    //             positionMarker.addChessPosition(testBoard[i][j].charAt(0), new Position(j, i));
    //         }
    //     }
    //     ValidMoveFetch validMoveFetch = new ValidMoveFetch();
    //     validMoveFetch.findAllValidMovePosition('B', positionMarker.getAllChessPosition('B'), board);
    //     ArrayList<int[]> result = validMoveFetch.getValidMoveDirections(new Position("C4"));
    //     ArrayList<int[]> expectedResult = new ArrayList<int[]>();
    //     expectedResult.add(new int[] {1, 0});
    //     for (int[] test : result) {
    //         System.out.printf("[%d, %d]", test[0], test[1]);
    //     }
    // }
    @Test
    public void ValidMoveFetchTest1_1() {
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
        ValidMoveFetch validMoveFetch = new ValidMoveFetch();
        validMoveFetch.findAllValidMovePosition('B', positionMarker.getAllChessPosition('B'), board);
        int result = validMoveFetch.countValidMovePositon();
        int expectedResult = 7;
        assertEquals(expectedResult, result);
    }

    @Test
    public void ValidMoveFetchTest1_2() {
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
        ValidMoveFetch validMoveFetch = new ValidMoveFetch();
        validMoveFetch.findAllValidMovePosition('B', positionMarker.getAllChessPosition('B'), board);
        boolean result = validMoveFetch.isContainValidMovePosition(new Position("C4"));
        boolean expectedResult = true;
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
        ValidMoveFetch validMoveFetch = new ValidMoveFetch();
        validMoveFetch.findAllValidMovePosition('B', positionMarker.getAllChessPosition('B'), board);
        boolean result = validMoveFetch.isContainValidMovePosition(new Position("A1"));
        boolean expectedResult = false;
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
        ValidMoveFetch validMoveFetch = new ValidMoveFetch();
        validMoveFetch.findAllValidMovePosition('B', positionMarker.getAllChessPosition('B'), board);
        HashSet<Position> result = validMoveFetch.getValidMovePositions();
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
        ValidMoveFetch validMoveFetch = new ValidMoveFetch();
        validMoveFetch.findAllValidMovePosition('B', positionMarker.getAllChessPosition('B'), board);
        ArrayList<int[]> result = validMoveFetch.getValidMoveDirections(new Position("C4"));
        ArrayList<int[]> expectedResult = new ArrayList<int[]>();
        expectedResult.add(new int[] {1, 0});
        assertEquals(expectedResult.size(), result.size());
        for (int i = 0; i < expectedResult.size(); i++) {
            assertArrayEquals(expectedResult.get(i), result.get(i));
        }
    }
}
