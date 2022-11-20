package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashSet;
import org.junit.Test;

import Othello.*;

public class PositionMarkerTest {

    @Test
    public void PositionMarkerTest1_1() {
        PositionMarker positionMarker = new PositionMarker();
        HashSet<Position> result = positionMarker.getAllChessPosition('B');
        HashSet<Position> expectedResult = new HashSet<Position>();
        assertEquals(expectedResult, result);
    }

    @Test
    public void PositionMarkerTest1_2() {
        PositionMarker positionMarker = new PositionMarker();
        HashSet<Position> result = positionMarker.getAllChessPosition('W');
        HashSet<Position> expectedResult = new HashSet<Position>();
        assertEquals(expectedResult, result);
    }

    @Test
    public void PositionMarkerTest1_3() {
        PositionMarker positionMarker = new PositionMarker();
        HashSet<Position> result = positionMarker.getAllChessPosition('W');
        HashSet<Position> expectedResult = new HashSet<Position>();
        assertEquals(expectedResult, result);
    }

    @Test
    public void PositionMarkerTest1_4() {
        PositionMarker positionMarker = new PositionMarker();
        positionMarker.addChessPosition('B',  new Position("A1"));
        HashSet<Position> result = positionMarker.getAllChessPosition('B');
        HashSet<Position> expectedResult = new HashSet<Position>();
        expectedResult.add(new Position("A1"));
        assertEquals(expectedResult, result);
    }

    @Test
    public void PositionMarkerTest1_5() {
        PositionMarker positionMarker = new PositionMarker();
        positionMarker.addChessPosition('B',  new Position("A1"));
        int result = positionMarker.countBlackChess();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

    @Test
    public void PositionMarkerTest1_6() {
        PositionMarker positionMarker = new PositionMarker();
        positionMarker.addChessPosition('B',  new Position("A1"));
        int result = positionMarker.countWhiteChess();
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }
}
