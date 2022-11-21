package Othello;

public class BlackChess extends Chess{

    public BlackChess() {
        super('B');
    }
    
    @Override
    public WhiteChess filp() {
       return new WhiteChess();
    }
}
