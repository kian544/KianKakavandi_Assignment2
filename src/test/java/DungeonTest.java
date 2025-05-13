/**
 * Assignment 2
 * Kian Kakavandi, 2091078
 * For SE350 section 601
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DungeonTest {
    @Test
    public void testDungeonProgression() {
        Chamber start = new Chamber();
        Chamber goal = new Chamber();
        Character player = new Warrior("Test");
        Dungeon d = new Dungeon(player, start, goal);
        assertFalse(d.isFinished());
        d.moveTo(goal);
        assertTrue(d.isFinished());
    }
}
