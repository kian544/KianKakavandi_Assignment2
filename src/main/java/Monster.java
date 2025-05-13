/**
 * Assignment 2
 * Kian Kakavandi, 2091078
 * For SE350 section 601
 *
 * Monster interface for strength and craft monsters
 */
public interface Monster {
    String getName();
    int getHealth();
    boolean usingStrength();
    boolean usingCraft();
    void takeDamage(int damage);
    int MonstersRoll();
    String toString();
}