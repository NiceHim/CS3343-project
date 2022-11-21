package Othello;

public class WhiteChess extends Chess{

    public WhiteChess() {
        super('W');
    }
    
    @Override
    public BlackChess filp() {
        return new BlackChess();
    }
}
