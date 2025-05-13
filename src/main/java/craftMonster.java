import java.util.Random;

public class craftMonster {
    private Random rand=new Random();
    private final String name;
    private final int strength;
    private final int craft;
    private int health;

    public craftMonster(String name, int strength, int craft, int health) {
        this.name = name;
        this.strength = strength;
        this.craft = craft;
        this.health = health;
    }
    public boolean usingCraft(){ return strength==0; }
    public int getHealth(){ return health; }
    public void takeDamage(int damage){ health-=damage; }
    public String getName(){ return name; }

    public int MonstersRoll(){
        return rand.nextInt(6) + 1 + (usingCraft() ? craft:strength);
    }

    @Override
    public String toString(){
        return name + " " + strength + " " + craft + " " + health;
    }
}