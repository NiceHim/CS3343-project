package Othello;

import java.util.HashSet;

public class WithHintOutput implements OutputHandler {
    private HashSet<Position> ValidMovePositions;

    public WithHintOutput(HashSet<Position> ValidMovePositions) {
        this.ValidMovePositions = ValidMovePositions;
    }

    @Override
    public void printGameBoard(Grid[][] board) {
        String yDelimiter = "   +---+---+---+---+---+---+---+---+";
        System.out.println("     A   B   C   D   E   F   G   H");
        for (int i = 0; i < board.length; i++) {
            System.out.println(yDelimiter);
            System.out.printf(" %d ", i+1);
            for (int j = 0; j < board[i].length; j++) {
                if (j == board[i].length - 1) {
                    if (this.ValidMovePositions.contains(new Position(j, i)) == true) {
                        System.out.printf("| %s |", "*");
                    } else {
                        System.out.printf("| %s |", board[i][j].toString());
                    }
                    break;
                }
                if (this.ValidMovePositions.contains(new Position(j, i)) == true) {
                    System.out.printf("| %s ", "*");
                } else {
                    System.out.printf("| %s ", board[i][j].toString());
                }
            }
            System.out.println();
        }
        System.out.println(yDelimiter);

    }
    
}
