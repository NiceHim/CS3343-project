package Othello;

public class BlackChess extends Chess{

    public BlackChess() {
        super('B');
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public WhiteChess filp() {
       return new WhiteChess();
    }
}
