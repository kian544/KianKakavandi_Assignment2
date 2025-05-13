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

    public int getTotalStrength() {
        int bonus = 0;
        for (Item item : inventory) {
            bonus += item.getStrength();
        }
        return this.strength + bonus;
    }

    public int getTotalCraft() {
        int bonus = 0;
        for (Item item : inventory) {
            bonus += item.getCraft();
        }
        return this.craft + bonus;
    }

    public int getTotalHealth(){
        return this.health;
    }
    public void takeDamage(int damage){
        this.health -= damage;
    }
    public void addItem(Item item){
        this.inventory.add(item);
    }
}
