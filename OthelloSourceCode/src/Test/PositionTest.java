package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

import Othello.*;

public class PositionTest {
    
    @Test
    public void PositionTest1_1() {
        Position position = new Position(0, 0);
        String result = position.toString();
        String expectedResult = "A1";
        assertEquals(expectedResult, result);
    }

    @Test
    public void PositionTest1_2() {
        Position position = new Position("A1");
        int result = position.getXCoordinate();
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }

    @Test
    public void PositionTest1_3() {
        Position position = new Position("A1");
        int result = position.getYCoordinate();
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }

    @Test
    public void PositionTest1_4() {
        Position position = new Position("A1");
        int result = position.getId();
        int expectedResult = Integer.parseInt(String.valueOf(0)+String.valueOf(0));
        assertEquals(expectedResult, result);
    }

    @Test
    public void PositionTest1_5() {
        Position position = new Position("A1");
        int result = position.hashCode();
        int expectedResult = Integer.parseInt(String.valueOf(0)+String.valueOf(0));
        assertEquals(expectedResult, result);
    }

    @Test
    public void PositionTest1_6() {
        Position position = new Position("A1");
        boolean result = position.equals(new Position(0, 0));
        assertEquals(true, result);
    }
}
