import javax.swing.plaf.TextUI;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Chamber[] chambers = new Chamber[]{
                new Chamber(),
                new Chamber(new Sword()),
                new Chamber(new Shield()),
                new Chamber(),
                new Chamber()
        };

        //Connecting chambers to doors
        Door.connect(chambers[0], chambers[1]);

        // Randomly assign a monster to the door
        Random rand = new Random();
        Monster m1 = rand.nextBoolean()
                ? new strengthMonster("Goblin", 3, 0, 5)
                : new craftMonster("Specter", 0, 3, 5);
        Door.connect(chambers[1], chambers[2], m1);

        Monster m2 = rand.nextBoolean()
                ? new strengthMonster("Ogre", 4, 0, 6)
                : new craftMonster("Wraith", 0, 4, 6);
        Door.connect(chambers[2], chambers[3], m2);

        Door.connect(chambers[3], chambers[4]);
        Character player = new Wizard("Gandalf");

        //initializing the dungeon w player, entry, goal
        Dungeon d = new Dungeon(player, chambers[0], chambers[4]);

        TextUI ui = new TextUI();
        ui.play(d);
    }
}