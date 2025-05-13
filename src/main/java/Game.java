/*import javax.swing.plaf.TextUI;

public class Game {
    public static void main(String[] args) {
        Chamber[] chambers = new Chamber[]{
                new Chamber(),
                new Chamber(new Axe()),
                new Chamber(new Shield()),
                new Chamber(),
                new Chamber()
        };

        //Connecting chambers to doors
        Door.connect(chambers[0], chambers[1]);
        Door.connect(chambers[1], chambers[2], new Monster("Goblin", 1, 0, 3));
        Door.connect(chambers[2], chambers[3], new Monster("Spider", 3, 0, 5));
        Door.connect(chambers[3], chambers[4]);

        Character player = new Wizard("Gandalf");

        //initializing the dungeon w player, entry, goal
        Dungeon d = new Dungeon(player, chambers[0], chambers[4]);

        TextUI ui = new TextUI();
        ui.play(d);
    }
}*/