package Othello;

public class Player {
    private String name;
    private Character flag;

    public Player(String name, Character flag) {
        this.name = name;
        this.flag = flag;
    }

    public Character getFlag() {
        return this.flag;
    }

    public String getName() {
        return this.name;
    }
}
