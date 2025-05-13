/**
 * Assignment 2
 * Kian Kakavandi, 2091078
 * For SE350 section 601
 *
 * Setting up chambers, door connections, and items
 */


import java.util.*;
public class Chamber {

    private List<Item> items = new ArrayList<>();
    private List<Door> doors = new ArrayList<>();

    public Chamber(){}
    public Chamber(Item item){
        items.add(item);
    }
    public List<Item> getItems() {
        return items;
    }
    public List<Door> getDoors(){
        return doors;
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    public void addDoor(Door door){
        doors.add(door);
    }
}
