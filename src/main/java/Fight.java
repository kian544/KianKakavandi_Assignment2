import java.util.Random;

public class Fight implements Action {
    private Dungeon dungeon;
    private Monster monster;
    private Random rand = new Random();

    public Fight(Dungeon dungeon, Monster monster) {
        this.dungeon = dungeon;
        this.monster = monster;
    }

    @Override
    public void execute() {
        Character player = dungeon.getPlayer();
        int playerRoll = rand.nextInt(6) + 1;
        int playerStat = monster.usingStrength()
                ? player.getTotalStrength()
                : player.getTotalCraft();
        int totalPlayer = playerRoll + playerStat;

        int monsterRoll = monster.MonstersRoll();

        System.out.println("You rolled: " + playerRoll + " + " + playerStat + " = " + totalPlayer);
        System.out.println(monster.getName() + " rolled: " + monsterRoll);

        int difference = totalPlayer - monsterRoll;

        if (difference > 0) {
            monster.takeDamage(difference);
            System.out.println("You hit the monster for " + difference + " damage!");
        } else if (difference < 0) {
            player.takeDamage(-difference);
            System.out.println("You took " + (-difference) + " damage!");
        } else {
            System.out.println("It's a tie! No damage dealt.");
        }

        if (monster.getHealth() <= 0) {
            System.out.println("Monster defeated!");
        } else {
            System.out.println("Monster HP: " + monster.getHealth());
        }
    }

    @Override
    public String toString() {
        return "Fight: " + monster;
    }
}
