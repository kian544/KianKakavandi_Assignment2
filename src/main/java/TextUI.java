import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TextUI {
    public void play(Dungeon d){
        while(!d.isFinished()){
            print(d);
            Action a=ask(d);
            a.execute();
        }
    }
    //Printing the current room
    private void print(Dungeon d){
        Chamber r = d.getCurrentChamber();
        StringBuilder s=new StringBuilder();
        s.append("You're in a chamber with" + r.getDoors().size()+"doors\n");
        s.append("There are"+ r.getItems().size()+"items in the chamber!\n");


    }
}
