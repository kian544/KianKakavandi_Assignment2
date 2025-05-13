/**
 * Assignment 2
 * Kian Kakavandi, 2091078
 * For SE350 section 601
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterTest {
    @Test
    public void testStrengthMonster() {
        Monster m = new strengthMonster("Goblin", 3, 0, 6);
        assertTrue(m.usingStrength());
        assertFalse(m.usingCraft());
        assertEquals(6, m.getHealth());
    }

    @Test
    public void testCraftMonster() {
        Monster m = new craftMonster("Specter", 0, 4, 5);
        assertTrue(m.usingCraft());
        assertFalse(m.usingStrength());
        assertEquals(5, m.getHealth());
    }

    @Test
    public void testMonsterDamage() {
        Monster m = new strengthMonster("Goblin", 3, 0, 6);
        m.takeDamage(2);
        assertEquals(4, m.getHealth());
    }
}
