public class PrintError implements Action {
    private Dungeon dungeon;
    private Exception error;

    public PrintError(Dungeon dungeon, Exception e) {
        this.dungeon = dungeon;
        this.error = e;
    }

    @Override
    public void execute() {
        System.out.println("Invalid input! Please enter a number.");
    }

    @Override
    public String toString() {
        return "Invalid action";
    }
}
