package Othello;


public abstract class Chess {
    private final Character value;

    public Chess(Character value) {
        this.value = value;
    }

    public abstract Chess filp();

    public Character getValue() {
        return this.value;
    }
}
