package Othello;

public class NormalOutput implements OutputHandler {
    
    @Override
    public void printGameBoard(Grid[][] board) {
        String yDelimiter = "   +---+---+---+---+---+---+---+---+";
        System.out.println("     A   B   C   D   E   F   G   H");
        for (int i = 0; i < board.length; i++) {
            System.out.println(yDelimiter);
            System.out.printf(" %d ", i+1);
            for (int j = 0; j < board[i].length; j++) {
                if (j == board[i].length - 1) {
                    System.out.printf("| %s |", board[i][j].toString());
                    break;
                }
                System.out.printf("| %s ", board[i][j].toString());
            }
            System.out.println();
        }
        System.out.println(yDelimiter);
    }

    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        OutputHandler outputHandler = new NormalOutput();
        outputHandler.printGameBoard(gameBoard.getBoard());
    }
}
