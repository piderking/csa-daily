import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class Baby here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Baby
{
    public static String[] getStates(String directoryPath)  throws FileNotFoundException {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        
        // Important
        String[] states = new String[files.length];
        
        
        if (files != null) {
            for (int i = 0; i < files.length; i++){
                states[i] = files[i].getName().substring(6,8);
                // System.out.println(states[i]);
            }
        } else {
            throw  new FileNotFoundException("Directory is empty or does not exist (using File).");
        }
        return states;
    }
    
  
    public static String stateToFile(String state){
        return "./data/STATE."+state+".txt";
    }
    public static boolean isValidState(String[] states, String st) {
        for (int i = 0; i < states.length; i++){
            if (states[i].equals(st)){
                return true;
            }
        }
        return false;
    }
    public static boolean isActiveState(ArrayList<String> states, String st) {
        for (int i = 0; i < states.size(); i++){
            if (states.get(i).equals(st)){
                return true;
            }
        }
        return false;
    }
    public static void main (String[] args) {
        boolean active = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Command, (help for options)");
        
        // Active States
        ArrayList<String> active_states = new ArrayList<>();
        
        // Valid States
        String[] states = null;
        try
        {
            states = getStates("./data/");
        }
        catch (FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }
        
        while (active) {
            System.out.print(">");

            if (in.hasNext()){
                
                switch (in.nextLine().toLowerCase().trim()){
                    case ("help") : {
                        System.out.println("Help Page!");
                        break;
                    } case ("add") : {
                        System.out.println("Enter States to Add");
                        while (!in.hasNext()){}
                        String[] strs = in.nextLine().toUpperCase().split(" ");
                        for (String s : strs){
                            if (!isValidState(states, s)){
                                System.out.println(s +": Invalid State");
                                continue;
                            }
                            if (isActiveState(active_states, s)){
                                System.out.println(s +": Duplicate Active State");
                                continue;
                            }
                            
                            // Just to satisfy compiler, doesn't actually do anything...
                            active_states.add(s);
                            System.out.println(s +": Added");

                        }
                        break;
                    }
                     case ("display") : {
                        System.out.println("Enter [YEAR] [GENDER (F/M)]");
                        while (!in.hasNext()){}
                        String[] strs = in.nextLine().toUpperCase().split(" ");
                        
                        if (strs.length != 2){
                            System.out.println("Found " + strs.length + "but expected 2 args");
                            break;
                        }
                        
                        String gender = strs[1];
                        String year = strs[0];
                        
                        if (active_states.size() > 0) {
                            System.out.print(stateToFile(active_states.get(0)));
                            try {
                            Query q = new Query(stateToFile(active_states.get(0)), year, gender);
                            for (int i = 1; i < active_states.size(); i++){

                                 System.out.print(stateToFile(active_states.get(i)));

                            }
                            q.display();
                            } catch(FileNotFoundException e){
                                System.out.println("Couldn't find the file!");
                            }
                        } else {
                            System.out.println("No found");
                        }
                        System.out.println();
                        break;

                    }
                    case ("exit") : {
                        active=false;
                        break;
                    }
                    default: {
                    System.out.println("Enter valid Command! (help for help)");
                    }
                }
            } else {
                System.out.println("Enter valid Command! (help for help)");
            }
            
            System.out.println();
        }
        System.out.println("Thank You for using.. Exiting");
        
        
    }
}
