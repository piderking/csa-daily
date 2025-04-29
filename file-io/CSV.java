import java.io.* ; 
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
/**
 * Write a description of class CSV here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CSV
{
    // instance variables - replace the example below with your own
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
    
    /**
     * Constructor for objects of class CSV
     */
    public CSV(String file_name)
    {
        // initialise instance variables
        try{
            File file = new File(file_name);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                ArrayList<String> t = new ArrayList<String>();
                String[] v = myReader.nextLine().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                for (String d : v){
                    t.add(d);
                }
                data.add(t);
            }
        } catch (FileNotFoundException e){
          System.out.println("An error occurred.");
          e.printStackTrace();
        } 

    }
    public String field(int r, int c){
        return data.get(r).get(c);
    }
    public int numberOfRows(){
        return data.size();
    }
    public int numberOfFields(int r){
        return data.get(r).size();
    }

}
