/**
 * Assignment 2
 * Kian Kakavandi, 2091078
 * For SE350 section 601
 *
 * Used the provided game file, but had some more fun with it and randomized certain things like monsters
 */
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character player;

        System.out.println("Choose your character:");
        System.out.println("1. Wizard (High Craft)");
        System.out.println("2. Warrior (High Strength)");
        System.out.print("Enter 1 or 2: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter your character's name: ");
        String name = scanner.nextLine();

        if (choice == 2) {
            player = new Warrior(name);
        } else {
            player = new Wizard(name); // default to Wizard
        }
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
                ? new strengthMonster("Goblin", 3, 0, 3)
                : new craftMonster("Specter", 0, 3, 3);
        Door.connect(chambers[1], chambers[2], m1);

        Monster m2 = rand.nextBoolean()
                ? new strengthMonster("Ogre", 4, 0, 4)
                : new craftMonster("Wraith", 0, 4, 4);
        Door.connect(chambers[2], chambers[3], m2);

        Door.connect(chambers[3], chambers[4]);

        //initializing the dungeon w player, entry, goal
        Dungeon d = new Dungeon(player, chambers[0], chambers[4]);

        TextUI ui = new TextUI();
        ui.play(d);
    }
}