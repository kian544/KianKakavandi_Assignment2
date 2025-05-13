import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {
    @Test
    public void testWizardStats() {
        Character c = new Wizard("Melenia");
        assertEquals(7, c.getTotalHealth());
        assertEquals(0, c.getTotalStrength());
        assertEquals(2, c.getTotalCraft());
    }

    @Test
    public void testWarriorStats() {
        Character c = new Warrior("Margot");
        assertEquals(5, c.getTotalHealth());
        assertEquals(2, c.getTotalStrength());
        assertEquals(0, c.getTotalCraft());
    }

    @Test
    public void testAddItemBonus() {
        Character c = new Warrior("Cindry");
        c.addItem(new Sword());  // +2 strength
        assertEquals(4, c.getTotalStrength());
    }

    @Test
    public void testTakeDamage() {
        Character c = new Wizard("Kian");
        c.takeDamage(3);
        assertEquals(4, c.getTotalHealth());
    }
}
