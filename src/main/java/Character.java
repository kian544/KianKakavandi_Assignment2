import java.util.*;

public abstract class Character {
    protected String name;
    protected int health;
    protected int strength;
    protected int craft;
    protected List<Item> inventory = new ArrayList<>();
    protected List<Item> inUse = new ArrayList<>();

    public Character(String name, int health, int strength, int craft) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.craft = craft;
    }

    public int getTotalStrength(){
        return this.strength;
    }

    public int getTotalHealth(){
        return this.health;
    }

    public int getTotalCraft(){
        return this.craft;
    }
}
