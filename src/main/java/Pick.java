/**
 * Assignment 2
 * Kian Kakavandi, 2091078
 * For SE350 section 601
 *
 * allows for player to pick up item before fight
 */
public class Pick implements Action {
    private Dungeon dungeon;
    private Item item;

    public Pick(Dungeon dungeon, Item item) {
        this.dungeon = dungeon;
        this.item = item;
    }

    @Override
    public void execute() {
        dungeon.getPlayer().addItem(item);
        dungeon.getCurrentChamber().removeItem(item);
        System.out.println("You picked up: " + item);
    }

    @Override
    public String toString() {
        return "Pick up item: " + item;
    }
}
