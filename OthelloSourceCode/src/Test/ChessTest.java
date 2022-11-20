package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Othello.*;

public class ChessTest {

    @Test
    public void ChessTest1_1() {
        Chess chess = new BlackChess();
        Character result = chess.getValue();
        Character expectedResult = 'B';
        assertEquals(expectedResult, result);
    }

    @Test
    public void ChessTest1_2() {
        Chess chess = new WhiteChess();
        Character result = chess.getValue();
        Character expectedResult = 'W';
        assertEquals(expectedResult, result);
    }

    @Test
    public void ChessTest1_3() {
        Chess chess = new WhiteChess();
        Chess result = chess.filp();
        Chess expectedResult = new BlackChess();
        assertEquals(expectedResult.getClass(), result.getClass());
    }

    @Test
    public void ChessTest1_4() {
        Chess chess = new BlackChess();
        Chess result = chess.filp();
        Chess expectedResult = new WhiteChess();
        assertEquals(expectedResult.getClass(), result.getClass());
    }
}
