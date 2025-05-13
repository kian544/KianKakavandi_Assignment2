/**
 * Assignment 2
 * Kian Kakavandi, 2091078
 * For SE350 section 601
 *
 * Monster for strength, does not use crafting
 */
import java.util.Random;

public class strengthMonster implements Monster{
    private Random rand=new Random();
    private final String name;
    private final int strength;
    private final int craft;
    private int health;

    public strengthMonster(String name, int strength, int craft, int health) {
        this.name = name;
        this.strength = strength;
        this.craft = craft;
        this.health = health;
    }
    @Override
    public boolean usingStrength() {
        return craft == 0;
    }

    @Override
    public boolean usingCraft() {
        return !usingStrength();
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int MonstersRoll() {
        return rand.nextInt(6) + 1 + (usingStrength() ? strength : craft);
    }

    @Override
    public String toString() {
        return name + " " + strength + " " + craft + " " + health;
    }
}
