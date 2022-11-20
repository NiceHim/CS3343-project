package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.*;

import Othello.*;

public class NormalOutputTest {
    
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
            {" ", " ", " ", " ", "B", " ", " ", " "},
            {" ", " ", " ", " ", "B", " ", " ", " "},
            {" ", " ", " ", "W", "B", "W", " ", " "},
            {" ", " ", " ", "W", "W", "W", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
        };
        ChessFactory chessFactory = new ChessFactory();
        NormalOutput normalOutput = new NormalOutput();
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
        " 2 |   |   |   |   | B |   |   |   |"  + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 3 |   |   |   |   | B |   |   |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 4 |   |   |   | W | B | W |   |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 5 |   |   |   | W | W | W |   |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 6 |   |   |   |   |   |   |   |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 7 |   |   |   |   |   |   |   |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 8 |   |   |   |   |   |   |   |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n";
        assertEquals(expectedResult, newStreamData);
    }

    @Test
    public void NormalOutputTest1_2() {
        PrintStream originalStream; 
        PrintStream newStream; 
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream(); 
        originalStream = System.out; 
        newStream = new PrintStream(newConsole); 
        System.setOut(newStream);
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
        ChessFactory chessFactory = new ChessFactory();
        NormalOutput normalOutput = new NormalOutput();
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
        " 1 |   |   | B | B | B | B | B |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+"  + "\r\n" +
        " 2 |   |   | B | B | W | B |   |   |"  + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 3 | B | B | B | W | B | B |   |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 4 | B | B | W | W | B | B | B | B |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 5 |   | B | B | W | W | B | B | B |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 6 |   | B | B | B | B | B | B | B |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 7 |   |   | B | B | B | B |   |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n" +
        " 8 |   | B | B | B |   |   | B |   |" + "\r\n" +
        "   +---+---+---+---+---+---+---+---+" + "\r\n";
        assertEquals(expectedResult, newStreamData);
    }

}
