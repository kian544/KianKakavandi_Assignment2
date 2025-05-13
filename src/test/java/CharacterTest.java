import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCharacter extends Character {
    public TestCharacter(String name, int health, int strength, int craft) {
        super(name, health, strength, craft);
    }
}

public class CharacterTest {

    @org.junit.Test
    public void testGetTotalStrength() {
        Character c = new TestCharacter("TestHero", 100, 25, 10);
        assertEquals(25, c.getTotalStrength(), "Strength should match the initialized value");
    }

    @Test
    public void testConstructorInitialization() {
        Character c = new TestCharacter("TestHero", 100, 25, 10);
        assertEquals("TestHero", c.name);
        assertEquals(100, c.health);
        assertEquals(25, c.strength);
        assertEquals(10, c.craft);
    }
}
