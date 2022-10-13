package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;
import java.util.HashSet;

import Othello.*;

public class TestGameBoard {
    @Test
    public void TestGameBoard1_1() {
        HashSet<Position> expectedResults = new HashSet<>();
        expectedResults.add(new Position("C4"));
        expectedResults.add(new Position("E6"));
        expectedResults.add(new Position("D3"));
        expectedResults.add(new Position("F5"));
        GameBoard gameBoard = new GameBoard();
        gameBoard.findAllValidMovePosition('B');
        HashSet<Position> results = gameBoard.getValidMovePositions();
        assertEquals(expectedResults, results);
    }

    @Test
    public void TestGameBoard1_2() {
        HashSet<Position> expectedResults = new HashSet<>();
        expectedResults.add(new Position("F4"));
        expectedResults.add(new Position("E3"));
        expectedResults.add(new Position("D6"));
        expectedResults.add(new Position("C5"));
        GameBoard gameBoard = new GameBoard();
        gameBoard.findAllValidMovePosition('W');
        HashSet<Position> results = gameBoard.getValidMovePositions();
        assertEquals(expectedResults, results);
    }
}
