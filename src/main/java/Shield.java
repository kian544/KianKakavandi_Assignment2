/**
 * Assignment 2
 * Kian Kakavandi, 2091078
 * For SE350 section 601
 *
 * Shield item stats, gives +2 health to player
 */
public class Shield extends Item{
    public int getHealth(){return 2;}
    public int getStrength(){return 0;}
    public int getCraft(){return 0;}
    public String toString(){
        return "Shield";
    }
}