/**
 * Assignment 2
 * Kian Kakavandi, 2091078
 * For SE350 section 601
 *
 * Sword item stats, gives player +2 strength
 */
public class Sword extends Item{
    public int getStrength(){return 2;}
    public int getCraft(){return 0;}
    public int getHealth(){return 0;}
    public String toString(){
        return "Sword";
    }
}
