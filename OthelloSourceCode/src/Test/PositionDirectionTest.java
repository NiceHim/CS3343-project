package Test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.*;

import Othello.*;

public class PositionDirectionTest {
    @Test
    public void PositionDirectionTest1_1() {
        PositionDirection positionDirection = new PositionDirection(0, 0, new int[] {0, 1});
        int[] result = positionDirection.getDirection();
        int[] expectedResult = new int[] {0, 1};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void PositionDirectionTest1_2() {
        PositionDirection positionDirection = new PositionDirection("A1", new int[] {0, 1});
        int[] result = positionDirection.getDirection();
        int[] expectedResult = new int[] {0, 1};
        assertArrayEquals(expectedResult, result);
    }
}
