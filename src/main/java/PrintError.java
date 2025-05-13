/**
 * Assignment 2
 * Kian Kakavandi, 2091078
 * For SE350 section 601
 *
 * Prints invalid input errors
 */
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
