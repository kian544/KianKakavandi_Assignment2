import java.util.*;

public class Dungeon {
    private Character player;
    private Chamber current;
    private Chamber goal;

    public Dungeon(Character player, Chamber start, Chamber goal) {
        this.player = player;
        this.current = start;
        this.goal = goal;
    }

    public Character getPlayer() {
        return player;
    }

    public Chamber getCurrentChamber() {
        return current;
    }

    public void moveTo(Chamber c) {
        current = c;
    }

    public boolean isFinished() {
        return current == goal || player.getTotalHealth() <= 0;
    }

    public List<Action> getActions() {
        List<Action> actions = new ArrayList<>();

        // Pick up items
        for (Item item : current.getItems()) {
            actions.add(new Pick(this, item));
        }

        // Move or Fight
        for (Door d : current.getDoors()) {
            if (d.monsterPresent()) {
                actions.add(new Fight(this, d.getMonster()));
            } else {
                actions.add(new Move(this, d.getOther(current)));
            }
        }

        return actions;
    }
}
