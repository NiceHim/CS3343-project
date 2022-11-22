package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import Othello.*;

public class AppTest {
    @Test
    public void AppTest1_1() {
        PrintStream originalStream; 
        PrintStream newStream; 
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream(); 
        originalStream = System.out; 
        newStream = new PrintStream(newConsole); 
        System.setOut(newStream); 
        Player player1 = new Player("asd", 'B');
        Player player2 = new Player("qwe", 'W');
        int blackChessAmt = 5;
        int whiteChessAmt = 10;
        App.printWinMessage(player1, player2, blackChessAmt, whiteChessAmt);
        System.setOut(originalStream); 
        newStream.flush(); 
        String newStreamData = newConsole.toString(); 
        newStream.close(); 
        String expectedResult = 
        "--------------------Game Over--------------------" + "\r\n" +
        "Number of Black Chess: 5    Number pf White Chess: 10" + "\n" +
        "qwe(W) win the game!!!";
        assertEquals(expectedResult, newStreamData);
    }

    @Test
    public void AppTest1_2() {
        PrintStream originalStream; 
        PrintStream newStream; 
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream(); 
        originalStream = System.out; 
        newStream = new PrintStream(newConsole); 
        System.setOut(newStream); 
        Player player1 = new Player("asd", 'B');
        Player player2 = new Player("qwe", 'W');
        int blackChessAmt = 10;
        int whiteChessAmt = 5;
        App.printWinMessage(player1, player2, blackChessAmt, whiteChessAmt);
        System.setOut(originalStream); 
        newStream.flush(); 
        String newStreamData = newConsole.toString(); 
        newStream.close(); 
        String expectedResult = 
        "--------------------Game Over--------------------" + "\r\n" +
        "Number of Black Chess: 10    Number pf White Chess: 5" + "\n" +
        "asd(B) win the game!!!";
        assertEquals(expectedResult, newStreamData);
    }

    @Test
    public void AppTest1_3() {
        PrintStream originalStream; 
        PrintStream newStream; 
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream(); 
        originalStream = System.out; 
        newStream = new PrintStream(newConsole); 
        System.setOut(newStream); 
        Player player1 = new Player("asd", 'B');
        Player player2 = new Player("qwe", 'W');
        int blackChessAmt = 10;
        int whiteChessAmt = 10;
        App.printWinMessage(player1, player2, blackChessAmt, whiteChessAmt);
        System.setOut(originalStream); 
        newStream.flush(); 
        String newStreamData = newConsole.toString(); 
        newStream.close(); 
        String expectedResult = 
        "--------------------Game Over--------------------" + "\r\n" +
        "Number of Black Chess: 10    Number pf White Chess: 10" + "\n" +
        "Tie!!!" + "\r\n";
        assertEquals(expectedResult, newStreamData);
    }

    @Test
    public void AppTest1_4() {
        PrintStream originalStream; 
        PrintStream newStream; 
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream(); 
        originalStream = System.out; 
        newStream = new PrintStream(newConsole); 
        System.setOut(newStream); 
        Player thisTurnPlayer = new Player("asd", 'B');
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
        GameBoard gameBoard = new GameBoard(testBoard);
        gameBoard.findAllValidMovePositionAndDirection('B');
        App.printHint(thisTurnPlayer, gameBoard);
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
        "   +---+---+---+---+---+---+---+---+" + "\r\n" + 
        "asd(B), please input position (e.g. A1):" + "\n";
        assertEquals(expectedResult, newStreamData);
    }
}
