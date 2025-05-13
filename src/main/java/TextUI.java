import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TextUI {
    public void play(Dungeon d){
        while(!d.isFinished()){
            print(d);
            Action a = ask(d);
            a.execute();
        }

        if (d.getPlayer().getTotalHealth() <= 0) {
            System.out.println("You died! Game over.");
        } else {
            System.out.println("🎉 Dungeon completed! Congratulations! 🎉");
        }
    }

    //Printing the current room
    private void print(Dungeon d){
        Chamber r = d.getCurrentChamber();
        StringBuilder s=new StringBuilder();
        s.append("You're in a chamber with " + r.getDoors().size()+" doors\n");
        s.append("There are "+ r.getItems().size()+" items in the chamber!\n");
        for (Door door : r.getDoors()) {
            Monster m = door.getMonster();
            if (m != null && m.getHealth() > 0) {
                s.append("Door guarded by: ").append(m.toString()).append("\n");
            }
        }
        System.out.println(s.toString());
    }
    //Asks user for action
    private Action ask(Dungeon d){
        StringBuilder s=new StringBuilder();
        s.append("What do you want to do? \n");
        List<Action> actions=d.getActions();
        for(int i=0;i<actions.size();i++){
            Action a=actions.get(i);
            s.append("\t" + i + ": " + a.toString()+"\n");
        }
        System.out.println(s.toString());

        //ask for action
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try{
            int command=Integer.parseInt(reader.readLine());
            return actions.get(command);
        } catch(IOException e){
            return new PrintError(d, e);
        }
    }
}