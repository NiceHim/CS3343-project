package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import Othello.*;

public class ChessFatoryTest {
    @Test
    public void ChessFatoryTest1_1() {
        ChessFactory chessFactory = new ChessFactory();
        Chess result = chessFactory.getChess('B');
        Chess expectedResult = new BlackChess();
        assertEquals(expectedResult.getClass(), result.getClass());
    }

    @Test
    public void ChessFatoryTest1_2() {
        ChessFactory chessFactory = new ChessFactory();
        Chess result = chessFactory.getChess('W');
        Chess expectedResult = new WhiteChess();
        assertEquals(expectedResult.getClass(), result.getClass());
    }

    @Test
    public void ChessFatoryTest1_3() {
        ChessFactory chessFactory = new ChessFactory();
        Chess result = chessFactory.getChess('A');
        Chess expectedResult = null;
        assertEquals(expectedResult, result);
    }
}
