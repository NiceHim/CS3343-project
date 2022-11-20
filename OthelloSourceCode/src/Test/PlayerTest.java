package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Othello.*;

public class PlayerTest {
    @Test
    public void PlayerTest1_1() {
        Player player = new Player("qwe", 'B');
        Character result = player.getFlag();
        Character expectedResult = 'B';
        assertEquals(expectedResult, result);
    }

    @Test
    public void PlayerTest1_2() {
        Player player = new Player("asd", 'B');
        String result = player.getName();
        String expectedResult = "asd";
        assertEquals(expectedResult, result);
    }
}
