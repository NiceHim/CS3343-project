package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;
import java.util.HashSet;

import Othello.*;

public class GameBoardTest {
    @Test
    public void GameBoardTest1_1() {
        HashSet<Position> expectedResult = new HashSet<>();
        expectedResult.add(new Position("C4"));
        expectedResult.add(new Position("E6"));
        expectedResult.add(new Position("D3"));
        expectedResult.add(new Position("F5"));
        GameBoard gameBoard = new GameBoard();
        gameBoard.findAllValidMovePosition('B');
        HashSet<Position> result = gameBoard.getValidMovePositions();
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest1_2() {
        HashSet<Position> expectedResult = new HashSet<>();
        expectedResult.add(new Position("F4"));
        expectedResult.add(new Position("E3"));
        expectedResult.add(new Position("D6"));
        expectedResult.add(new Position("C5"));
        GameBoard gameBoard = new GameBoard();
        gameBoard.findAllValidMovePosition('W');
        HashSet<Position> result = gameBoard.getValidMovePositions();
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest1_3() {
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
        HashSet<Position> expectedResult = new HashSet<>() ;
        expectedResult.add(new Position("E1"));
        expectedResult.add(new Position("D3"));
        expectedResult.add(new Position("F3"));
        expectedResult.add(new Position("D2"));
        expectedResult.add(new Position("F2"));
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('W');
        HashSet<Position> result = gameBoard.getValidMovePositions();
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest1_4() {
        String testBoard[][] = {
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", "W", " ", " ", " ", " "},
            {" ", " ", " ", "W", " ", " ", " ", " "},
            {" ", " ", " ", "W", "W", "W", " ", " "},
            {" ", " ", " ", "W", "W", "W", " ", " "},
            {" ", " ", " ", " ", " ", "B", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        HashSet<Position> expectedResult = new HashSet<>() ;
        expectedResult.add(new Position("G7"));
        expectedResult.add(new Position("F7"));
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('W');
        HashSet<Position> result = gameBoard.getValidMovePositions();
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest1_5() {
        String testBoard[][] = {
            {" ", " ", "W", "W", "W", "W", " ", " "},
            {" ", " ", "W", "W", "W", "B", " ", " "},
            {"B", "B", "W", "W", "W", "B", "B", " "},
            {"W", "W", "W", "W", "W", "W", "B", " "},
            {" ", "W", "W", "W", "W", "W", "B", "B"},
            {" ", " ", "W", "W", "W", "W", "W", " "},
            {" ", " ", " ", "W", "W", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        HashSet<Position> expectedResult = new HashSet<>() ;
        expectedResult.add(new Position("G7"));
        expectedResult.add(new Position("F7"));
        expectedResult.add(new Position("B6"));
        expectedResult.add(new Position("A5"));
        expectedResult.add(new Position("C8"));
        expectedResult.add(new Position("C7"));
        expectedResult.add(new Position("B7"));
        expectedResult.add(new Position("B2"));
        expectedResult.add(new Position("F8"));
        expectedResult.add(new Position("D8"));
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('B');
        HashSet<Position> result = gameBoard.getValidMovePositions();
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest1_7() {
        String testBoard[][] = {
            {" ", " ", "W", "W", "W", "W", " ", " "},
            {" ", " ", "W", "W", "W", "B", " ", " "},
            {"B", "B", "W", "W", "W", "B", "B", " "},
            {"W", "W", "W", "W", "W", "W", "B", " "},
            {" ", "W", "W", "W", "W", "W", "B", "B"},
            {" ", " ", "W", "W", "W", "W", "W", " "},
            {" ", " ", " ", "W", "W", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        HashSet<Position> expectedResult = new HashSet<>() ;
        expectedResult.add(new Position("A2"));
        expectedResult.add(new Position("B2"));
        expectedResult.add(new Position("G2"));
        expectedResult.add(new Position("H3"));
        expectedResult.add(new Position("H4"));
        expectedResult.add(new Position("H2"));
        expectedResult.add(new Position("G1"));
        expectedResult.add(new Position("H6"));
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('W');
        HashSet<Position> result = gameBoard.getValidMovePositions();
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest1_8() {
        String testBoard[][] = {
            {" ", " ", "B", "B", "B", "B", "B", " "},
            {" ", " ", "B", "B", "W", "B", " ", " "},
            {"B", "B", "B", "W", "B", "B", " ", " "},
            {"B", "B", "W", "W", "B", "B", "B", "B"},
            {" ", "B", "B", "W", "W", "B", "B", "B"},
            {" ", "B", "B", "B", "B", "B", "B", "B"},
            {" ", " ", "B", "B", "B", "B", " ", " "},
            {" ", "B", "B", "B", " ", " ", "B", " "},
        };
        HashSet<Position> expectedResult = new HashSet<>() ;
        expectedResult.add(new Position("B1"));
        expectedResult.add(new Position("B2"));
        expectedResult.add(new Position("A2"));
        expectedResult.add(new Position("A5"));
        expectedResult.add(new Position("A6"));
        expectedResult.add(new Position("A7"));
        expectedResult.add(new Position("B7"));
        expectedResult.add(new Position("E8"));
        expectedResult.add(new Position("G2"));
        expectedResult.add(new Position("G3"));
        expectedResult.add(new Position("G7"));
        expectedResult.add(new Position("H7"));
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('W');
        HashSet<Position> result = gameBoard.getValidMovePositions();
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest1_9() {
        String testBoard[][] = {
            {" ", " ", "B", "B", "B", "B", "B", " "},
            {" ", " ", "B", "B", "W", "B", " ", " "},
            {"B", "B", "B", "W", "B", "B", " ", " "},
            {"B", "B", "W", "W", "B", "B", "B", "B"},
            {" ", "B", "B", "W", "W", "B", "B", "B"},
            {" ", "B", "B", "B", "B", "B", "B", "B"},
            {" ", " ", "B", "B", "B", "B", " ", " "},
            {" ", "B", "B", "B", " ", " ", "B", " "},
        };
        HashSet<Position> expectedResult = new HashSet<>() ;
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('B');
        HashSet<Position> result = gameBoard.getValidMovePositions();
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest1_10() {
        String testBoard[][] = {
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", "W", "W", " ", " ", " ", " "},
            {" ", " ", "W", "W", "W", " ", " ", " "},
            {" ", " ", "W", "B", "B", "B", " ", " "},
            {" ", "W", "W", "B", "B", "B", " ", " "},
            {" ", "B", "W", "B", "B", "B", " ", " "},
            {" ", " ", "W", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        HashSet<Position> expectedResult = new HashSet<>() ;
        expectedResult.add(new Position("B1"));
        expectedResult.add(new Position("C1"));
        expectedResult.add(new Position("D1"));
        expectedResult.add(new Position("B2"));
        expectedResult.add(new Position("E2"));
        expectedResult.add(new Position("F2"));
        expectedResult.add(new Position("B3"));
        expectedResult.add(new Position("B4"));
        expectedResult.add(new Position("A5"));
        expectedResult.add(new Position("B7"));
        expectedResult.add(new Position("B8"));
        expectedResult.add(new Position("D8"));
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('B');
        HashSet<Position> result = gameBoard.getValidMovePositions();
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest1_11() {
        String testBoard[][] = {
            {" ", "W", " ", " ", " ", " ", " ", " "},
            {" ", " ", "W", " ", "B", " ", " ", " "},
            {" ", "W", "W", "W", "W", "W", " ", " "},
            {" ", "W", "B", "W", "W", " ", " ", " "},
            {" ", "B", "W", "W", "B", "B", "B", "B"},
            {" ", " ", " ", "W", "B", " ", "B", " "},
            {" ", " ", " ", "W", "B", "B", "W", "W"},
            {" ", " ", " ", " ", "B", " ", " ", " "},
        };
        HashSet<Position> expectedResult = new HashSet<>() ;
        expectedResult.add(new Position("C1"));
        expectedResult.add(new Position("A2"));
        expectedResult.add(new Position("B2"));
        expectedResult.add(new Position("A3"));
        expectedResult.add(new Position("A4"));
        expectedResult.add(new Position("C6"));
        expectedResult.add(new Position("C7"));
        expectedResult.add(new Position("C8"));
        expectedResult.add(new Position("F4"));
        expectedResult.add(new Position("G4"));
        expectedResult.add(new Position("G8"));
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('B');
        HashSet<Position> result = gameBoard.getValidMovePositions();
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest1_12() {
        String testBoard[][] = {
            {" ", " ", " ", " ", "W", " ", " ", " "},
            {" ", "W", " ", " ", "W", " ", " ", " "},
            {" ", " ", "W", " ", "W", " ", " ", " "},
            {" ", " ", " ", "W", "W", " ", " ", " "},
            {" ", " ", "B", "B", "B", "B", "B", "B"},
            {" ", " ", " ", "W", " ", "W", "B", " "},
            {" ", " ", " ", "W", " ", "W", " ", " "},
            {" ", " ", " ", "W", " ", " ", " ", " "},
        };
        HashSet<Position> expectedResult = new HashSet<>() ;
        expectedResult.add(new Position("B4"));
        expectedResult.add(new Position("F4"));
        expectedResult.add(new Position("H4"));
        expectedResult.add(new Position("B6"));
        expectedResult.add(new Position("C6"));
        expectedResult.add(new Position("E6"));
        expectedResult.add(new Position("H6"));
        expectedResult.add(new Position("H7"));
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('W');
        HashSet<Position> result = gameBoard.getValidMovePositions();
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest2_1() {
        HashSet<Position> expectedResult = new HashSet<>();
        expectedResult.add(new Position("D3"));
        expectedResult.add(new Position("D4"));
        expectedResult.add(new Position("E4"));
        expectedResult.add(new Position("D5"));
        GameBoard gameBoard = new GameBoard();
        gameBoard.findAllValidMovePosition('B');
        gameBoard.addChess('B', new Position("D3"));
        HashSet<Position> result = gameBoard.getAllChessPosition('B');
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest2_2() {
        String testBoard[][] = {
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", "W", "W", " ", " ", " ", " "},
            {" ", " ", "W", "W", "W", " ", " ", " "},
            {" ", " ", "W", "B", "B", "B", " ", " "},
            {" ", "W", "W", "B", "B", "B", " ", " "},
            {" ", "B", "W", "B", "B", "B", " ", " "},
            {" ", " ", "W", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        HashSet<Position> expectedResult = new HashSet<>();
        expectedResult.add(new Position("C1"));
        expectedResult.add(new Position("D2"));
        expectedResult.add(new Position("E3"));
        expectedResult.add(new Position("D4"));
        expectedResult.add(new Position("E4"));
        expectedResult.add(new Position("F4"));
        expectedResult.add(new Position("D5"));
        expectedResult.add(new Position("E5"));
        expectedResult.add(new Position("F5"));
        expectedResult.add(new Position("B6"));
        expectedResult.add(new Position("D6"));
        expectedResult.add(new Position("E6"));
        expectedResult.add(new Position("F6"));
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('B');
        gameBoard.addChess('B', new Position("C1"));
        HashSet<Position> result = gameBoard.getAllChessPosition('B');
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest2_3() {
        String testBoard[][] = {
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", "W", "W", " ", " ", " ", " "},
            {" ", " ", "W", "W", "W", " ", " ", " "},
            {" ", " ", "W", "B", "B", "B", " ", " "},
            {" ", "W", "W", "B", "B", "B", " ", " "},
            {" ", "B", "W", "B", "B", "B", " ", " "},
            {" ", " ", "W", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        HashSet<Position> expectedResult = new HashSet<>();

        expectedResult.add(new Position("D4"));
        expectedResult.add(new Position("E4"));
        expectedResult.add(new Position("F4"));
        expectedResult.add(new Position("D5"));
        expectedResult.add(new Position("E5"));
        expectedResult.add(new Position("F5"));
        expectedResult.add(new Position("B6"));
        expectedResult.add(new Position("D6"));
        expectedResult.add(new Position("E6"));
        expectedResult.add(new Position("F6"));
        expectedResult.add(new Position("C7"));
        expectedResult.add(new Position("D8"));
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('B');
        gameBoard.addChess('B', new Position("D8"));
        HashSet<Position> result = gameBoard.getAllChessPosition('B');
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest2_4() {
        String testBoard[][] = {
            {" ", " ", "B", "B", "B", "B", "B", " "},
            {" ", " ", "B", "B", "W", "B", " ", " "},
            {"B", "B", "B", "W", "B", "B", " ", " "},
            {"B", "B", "W", "W", "B", "B", "B", "B"},
            {" ", "B", "B", "W", "W", "B", "B", "B"},
            {" ", "B", "B", "B", "B", "B", "B", "B"},
            {" ", " ", "B", "B", "B", "B", " ", " "},
            {" ", "B", "B", "B", " ", " ", "B", " "},
        };
        HashSet<Position> expectedResult = new HashSet<>();

        expectedResult.add(new Position("E2"));
        expectedResult.add(new Position("D3"));
        expectedResult.add(new Position("C4"));
        expectedResult.add(new Position("D4"));
        expectedResult.add(new Position("D5"));
        expectedResult.add(new Position("E5"));
        expectedResult.add(new Position("E6"));
        expectedResult.add(new Position("E7"));
        expectedResult.add(new Position("E8"));
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('W');
        gameBoard.addChess('W', new Position("E8"));
        HashSet<Position> result = gameBoard.getAllChessPosition('W');
        assertEquals(expectedResult, result);
    }

    @Test
    public void TestGameBoard3_1() {
        String testBoard[][] = {
            {" ", " ", "B", "B", "B", "B", "B", " "},
            {" ", " ", "B", "B", "W", "B", " ", " "},
            {"B", "B", "B", "W", "B", "B", " ", " "},
            {"B", "B", "W", "W", "B", "B", "B", "B"},
            {" ", "B", "B", "W", "W", "B", "B", "B"},
            {" ", "B", "B", "B", "B", "B", "B", "B"},
            {" ", " ", "B", "B", "B", "B", " ", " "},
            {" ", "B", "B", "B", " ", " ", "B", " "},
        };
        int expectedResult = 9;
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('W');
        gameBoard.addChess('W', new Position("E8"));
        int result = gameBoard.countWhiteChess();
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest3_2() {
        String testBoard[][] = {
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", "W", "W", " ", " ", " ", " "},
            {" ", " ", "W", "W", "W", " ", " ", " "},
            {" ", " ", "W", "B", "B", "B", " ", " "},
            {" ", "W", "W", "B", "B", "B", " ", " "},
            {" ", "B", "W", "B", "B", "B", " ", " "},
            {" ", " ", "W", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        int expectedResult = 12;
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('B');
        gameBoard.addChess('B', new Position("D8"));
        int result = gameBoard.countBlackChess();
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest4_1() {
        String testBoard[][] = {
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", "W", "W", " ", " ", " ", " "},
            {" ", " ", "W", "W", "W", " ", " ", " "},
            {" ", " ", "W", "W", "W", "W", " ", " "},
            {" ", "W", "W", "W", "W", "W", " ", " "},
            {" ", "W", "W", "W", "W", "W", " ", " "},
            {" ", " ", "W", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        boolean expectedResult = true;
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('B');
        boolean result = gameBoard.isEmptyValidMovePositon();
        assertEquals(expectedResult, result);
    }

    
    @Test
    public void GameBoardTest4_2() {
        String testBoard[][] = {
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", "W", "W", " ", " ", " ", " "},
            {" ", " ", "W", "W", "W", " ", " ", " "},
            {" ", " ", "W", "B", "B", "B", " ", " "},
            {" ", "W", "W", "B", "B", "B", " ", " "},
            {" ", "B", "W", "B", "B", "B", " ", " "},
            {" ", " ", "W", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        boolean expectedResult = false;
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('B');
        boolean result = gameBoard.isEmptyValidMovePositon();
        assertEquals(expectedResult, result);
    }

    @Test
    public void GameBoardTest5_1() {
        String testBoard[][] = {
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", "W", "W", " ", " ", " ", " "},
            {" ", " ", "W", "W", "W", " ", " ", " "},
            {" ", " ", "W", "B", "B", "B", " ", " "},
            {" ", "W", "W", "B", "B", "B", " ", " "},
            {" ", "B", "W", "B", "B", "B", " ", " "},
            {" ", " ", "W", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        boolean expectedResult = true;
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('B');
        boolean result = gameBoard.isContainValidMovePosition(new Position("D1"));
        assertEquals(expectedResult, result);
    }

    
    @Test
    public void GameBoardTest5_2() {
        String testBoard[][] = {
            {" ", " ", "B", "B", "B", "B", "B", " "},
            {" ", " ", "B", "B", "W", "B", " ", " "},
            {"B", "B", "B", "W", "B", "B", " ", " "},
            {"B", "B", "W", "W", "B", "B", "B", "B"},
            {" ", "B", "B", "W", "W", "B", "B", "B"},
            {" ", "B", "B", "B", "B", "B", "B", "B"},
            {" ", " ", "B", "B", "B", "B", " ", " "},
            {" ", "B", "B", "B", " ", " ", "B", " "},
        };
        boolean expectedResult = false;
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePosition('W');
        boolean result = gameBoard.isContainValidMovePosition(new Position("A8"));
        assertEquals(expectedResult, result);
    }
}
