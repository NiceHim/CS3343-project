package Othello;

public class ChessFactory {

    public ChessFactory() {
        
    }

    public Chess getChess(Character chessType) {
        if (chessType == 'B') {
            return new BlackChess();
        } else if (chessType == 'W') {
            return new WhiteChess();
        } else {
            return null;
        }
    }
}
