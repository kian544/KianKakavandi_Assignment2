import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ActionTest {
    @Test
    public void testMoveAction() {
        Chamber a = new Chamber();
        Chamber b = new Chamber();
        Character c = new Warrior("Link");
        Dungeon d = new Dungeon(c, a, b);
        Move m = new Move(d, b);
        m.execute();
        assertEquals(b, d.getCurrentChamber());
    }

    @Test
    public void testPickAction() {
        Item sword = new Sword();
        Chamber chamber = new Chamber(sword);
        Character c = new Warrior("Thorfinn");
        Dungeon d = new Dungeon(c, chamber, chamber);
        Pick pick = new Pick(d, sword);
        pick.execute();
        assertEquals(1, c.inventory.size());
        assertTrue(c.inventory.contains(sword));
    }

    @Test
    public void testFightActionLosesHP() {
        Character c = new Warrior("Askladd");
        Monster m = new strengthMonster("Big Ogre", 100, 0, 5);  // super strong
        Dungeon d = new Dungeon(c, new Chamber(), new Chamber());
        Fight f = new Fight(d, m);
        f.execute();
        assertTrue(c.getTotalHealth() < 5);
    }
}
