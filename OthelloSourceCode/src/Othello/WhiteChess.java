package Othello;

public class WhiteChess extends Chess{

    public WhiteChess() {
        super('W');
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public BlackChess filp() {
        return new BlackChess();
    }
}
