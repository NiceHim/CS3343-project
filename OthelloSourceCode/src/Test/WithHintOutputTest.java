package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;

import org.junit.jupiter.api.*;

import Othello.*;

public class WithHintOutputTest {
    
    @Test
    public void NormalOutputTest1_1() {
        PrintStream originalStream; 
        PrintStream newStream; 
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream(); 
        originalStream = System.out; 
        newStream = new PrintStream(newConsole); 
        System.setOut(newStream); 
        String testBoard[][] = {
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", "W", "B", " ", " ", " "},
            {" ", " ", " ", "B", "W", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        HashSet<Position> testPosition = new HashSet<Position>();
        testPosition.add(new Position("D3"));
        testPosition.add(new Position("C4"));
        testPosition.add(new Position("F5"));
        testPosition.add(new Position("E6"));
        ChessFactory chessFactory = new ChessFactory();
        WithHintOutput normalOutput = new WithHintOutput(testPosition);
        Grid[][] board = new Grid[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Grid(new Position(j, i), null);
                if (testBoard[i][j].equals(" ")) continue;
                board[i][j].setChess(chessFactory.getChess(testBoard[i][j].charAt(0)));
            }
        }
        normalOutput.printGameBoard(board);
 
        System.setOut(originalStream); 
        newStream.flush(); 
        String newStreamData = newConsole.toString(); 
        newStream.close(); 

        String expectedResult = 
        "     A   B   C   D   E   F   G   H" + "\r\n" + 
        "   +---+---+---+---+---+---+---+---+" + "\r\n" + 
        " 1 |   |   |   |   |   |   |   |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+"  + "\r\n" +
        " 2 |   |   |   |   |   |   |   |   |"  + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 3 |   |   |   | * |   |   |   |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 4 |   |   | * | W | B |   |   |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 5 |   |   |   | B | W | * |   |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 6 |   |   |   |   | * |   |   |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 7 |   |   |   |   |   |   |   |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 8 |   |   |   |   |   |   |   |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n";
        assertEquals(expectedResult, newStreamData);
    }
}
