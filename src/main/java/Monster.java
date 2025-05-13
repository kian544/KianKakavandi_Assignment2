public interface Monster {
    String getName();
    int getHealth();
    boolean usingStrength();
    void takeDamage(int damage);
    int MonstersRoll();
    String toString();
}