/**
 * Assignment 2
 * Kian Kakavandi, 2091078
 * For SE350 section 601
 *
 * Magic Wand stats, gives player plus 2 to craft
 */
public class MagicWand extends Item{
    public int getHealth(){return 0;}
    public int getStrength(){return 0;}
    public int getCraft(){return 2;}
    public String toString(){
        return "Magic Wand";
    }
}