public class Move implements Action {
    private Dungeon dungeon;
    private Chamber destination;

    public Move(Dungeon dungeon, Chamber destination) {
        this.dungeon = dungeon;
        this.destination = destination;
    }
    @Override
    public void execute() {
        dungeon.moveTo(destination);
        System.out.println("You moved to the next chamber!");
    }
    @Override
    public String toString() {
        return "Want to move to another chamber?";
    }
}