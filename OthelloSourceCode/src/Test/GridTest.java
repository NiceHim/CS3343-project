package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Othello.*;

public class GridTest {
    @Test
    public void GridTest1_1() {
        Grid grid = new Grid(new Position(0, 0), new BlackChess());
        String result = grid.toString();
        String expectedResult = "B";
        assertEquals(expectedResult, result);
    }

    @Test
    public void GridTest1_2() {
        Grid grid = new Grid(new Position(0, 0), new BlackChess());
        Chess result = grid.getChess();
        Chess expectedResult = new BlackChess();
        assertEquals(expectedResult.getClass(), result.getClass());
    }

    @Test
    public void GridTest1_3() {
        Grid grid = new Grid(new Position(0, 0), new BlackChess());
        Position result = grid.getPosition();
        Position expectedResult = new Position("A1");
        assertEquals(expectedResult, result);
    }
}
