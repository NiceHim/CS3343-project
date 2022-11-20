package Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;


import Othello.*;

public class ValidMoveCheckerTest {
 
    @Test
    public void ValidMoveCheckerTest1_1() {
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
            }
        }
        ValidMoveChecker validMoveChecker = new ValidMoveChecker();
        HashMap<Position, int[]> result = validMoveChecker.findValidMove('B', new Position("E4"), board);
        HashMap<Position, int[]> expectedResult = new HashMap<Position, int[]>();
        expectedResult.put(new Position("C4"), new int[] {1, 0});
        expectedResult.put(new Position("G4"), new int[] {-1, 0});
        expectedResult.put(new Position("C6"), new int[] {1, -1});
        expectedResult.put(new Position("E6"), new int[] {0, -1});
        expectedResult.put(new Position("G6"), new int[] {-1, -1}); 
        assertEquals(expectedResult.keySet(), result.keySet());
        for (Map.Entry<Position, int[]> temp : expectedResult.entrySet()) {
            assertArrayEquals(temp.getValue(), result.get(temp.getKey()));
        }
    }

    @Test
    public void ValidMoveCheckerTest1_2() {
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
            }
        }
        ValidMoveChecker validMoveChecker = new ValidMoveChecker();
        ArrayList<PositionDirection> result = validMoveChecker.checkEightDirection('B', new Position("E4"), board);
        ArrayList<PositionDirection> expectedResult = new ArrayList<PositionDirection>();
        expectedResult.add(new PositionDirection("C4", new int[] {1, 0}));
        expectedResult.add(new PositionDirection("G4", new int[] {-1, 0}));
        expectedResult.add(new PositionDirection("C6", new int[] {1, -1}));
        expectedResult.add(new PositionDirection("E6", new int[] {0, -1}));
        expectedResult.add(new PositionDirection("G6", new int[] {-1, -1}));
        assertEquals(new HashSet<>(expectedResult), new HashSet<>(result));
    }

    @Test
    public void ValidMoveCheckerTest1_3() {
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
            }
        }
        ValidMoveChecker validMoveChecker = new ValidMoveChecker();
        ArrayList<PositionDirection> result = validMoveChecker.checkEightDirection('B', new Position("E2"), board);
        ArrayList<PositionDirection> expectedResult = new ArrayList<PositionDirection>();
        assertEquals(new HashSet<>(expectedResult), new HashSet<>(result));
    }

    @Test
    public void ValidMoveCheckerTest1_4() {
        ValidMoveChecker validMoveChecker = new ValidMoveChecker();
        Boolean result = validMoveChecker.isBoundary(8, 8);
        Boolean expectedResult = true;
        assertEquals(expectedResult, result);
    }

    @Test
    public void ValidMoveCheckerTest1_5() {
        ValidMoveChecker validMoveChecker = new ValidMoveChecker();
        Boolean result = validMoveChecker.isBoundary(5, 6);
        Boolean expectedResult = false;
        assertEquals(expectedResult, result);
    }


}
