/**
 * Assignment 2
 * Kian Kakavandi, 2091078
 * For SE350 section 601
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {
    @Test
    public void testSwordStats() {
        Item sword = new Sword();
        assertEquals(2, sword.getStrength());
        assertEquals(0, sword.getCraft());
        assertEquals(0, sword.getHealth());
    }

    @Test
    public void testShieldStats() {
        Item shield = new Shield();
        assertEquals(0, shield.getStrength());
        assertEquals(0, shield.getCraft());
        assertEquals(2, shield.getHealth());
    }

    @Test
    public void testWandStats() {
        Item wand = new MagicWand();
        assertEquals(0, wand.getStrength());
        assertEquals(2, wand.getCraft());
        assertEquals(0, wand.getHealth());
    }
}
