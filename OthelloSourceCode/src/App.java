import java.util.Scanner;

import Othello.*;

public class App {
    private static void printWinMessage(Player player1, Player player2, int blackChessAmt, int whiteChessAmt) {
        System.out.println("--------------------Game Over--------------------");
        System.out.printf("Number of Black Chess: %d    Number pf White Chess: %d\n", blackChessAmt, whiteChessAmt);
        if (blackChessAmt > whiteChessAmt) {
            System.out.printf("%s(%c) win the game!!!", player1.getName(), player1.getFlag());
        } else if (blackChessAmt < whiteChessAmt) {
            System.out.printf("%s(%c) win the game!!!", player2.getName(), player2.getFlag());
        } else {
            System.out.println("Tie!!!");
        }
    }
    public static void main(String[] args) throws Exception {
        String nameOfPlayer1;
        String nameOfPlayer2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welocome to Othello!");
        System.out.println("Please input the name of player1:");
        nameOfPlayer1 = scanner.nextLine();
        Player player1 = new Player(nameOfPlayer1, 'B');
        System.out.println("Please input the name of player2:");
        nameOfPlayer2 = scanner.nextLine();
        Player player2 = new Player(nameOfPlayer2, 'W');
        System.out.println("--------------------Game Start--------------------");
        int isEndGameCount = 0;
        boolean flag = true;
        OutputHandler normalOutputHandler = new NormalOutput();
        GameBoard gameBoard = new GameBoard();
        normalOutputHandler.printGameBoard(gameBoard.getBoard());
        while (true) {
            String input;
            Player thisTurnPlayer = flag == true ? player1 : player2;
            gameBoard.findAllValidMovePosition(thisTurnPlayer.getFlag());
            if (gameBoard.isEmptyValidMovePositon() == true) {
                if (gameBoard.countBlackChess() == 0 || gameBoard.countWhiteChess() == 0) {
                    printWinMessage(player1, player2, gameBoard.countBlackChess(), gameBoard.countWhiteChess());
                    break;
                }
                System.out.printf("No valid move for %s(%c). Pass!\n", thisTurnPlayer.getName(), thisTurnPlayer.getFlag());
                isEndGameCount++;
                if (isEndGameCount == 2) {
                    printWinMessage(player1, player2, gameBoard.countBlackChess(), gameBoard.countWhiteChess());
                    break;
                }
                continue;
            }
            isEndGameCount = 0;
            System.out.printf("%s(%c), please input position (e.g. A1). (Input H / h for Hint):\n", thisTurnPlayer.getName(), thisTurnPlayer.getFlag());
            input = scanner.nextLine();
            if (input.equals("H") || input.equals("h")) {
                new WithHintOutput(gameBoard.getValidMovePositions()).printGameBoard(gameBoard.getBoard());
                System.out.printf("%s(%c), please input position (e.g. A1):", thisTurnPlayer.getName(), thisTurnPlayer.getFlag());
                input = scanner.nextLine();
            }
            while (!gameBoard.isContainValidMovePosition(new Position(input))) {
                System.out.printf("Invalid Position! %s(%c), please input position (e.g. A1). (Input H / h for Hint):\n", thisTurnPlayer.getName(), thisTurnPlayer.getFlag());
                input = scanner.nextLine();
                if (input.equals("H") || input.equals("h")) {
                    new WithHintOutput(gameBoard.getValidMovePositions()).printGameBoard(gameBoard.getBoard());
                    System.out.printf("%s(%c), please input position (e.g. A1):\n", thisTurnPlayer.getName(), thisTurnPlayer.getFlag());
                    input = scanner.nextLine();
                }
            }
            gameBoard.addChess(thisTurnPlayer.getFlag(), new Position(input));
            normalOutputHandler.printGameBoard(gameBoard.getBoard());
            flag = !flag;
        }
        scanner.close();
    }
}
