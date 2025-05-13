public interface Monster {
    String getName();
    int getHealth();
    boolean usingStrength();
    boolean usingCraft();
    void takeDamage(int damage);
    int MonstersRoll();
    String toString();
}