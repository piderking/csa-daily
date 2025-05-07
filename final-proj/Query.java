import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class Query here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Query
{
    
    private ArrayList<String> names;
    private ArrayList<Integer> cnts;
    private String gender;
    private String year;
    public Query(String file_name, String year, String gender) throws FileNotFoundException{
        this.year = year;
        this.gender = gender;
        Scanner in = new Scanner(new File(file_name));
        names = new ArrayList<>();
        cnts = new ArrayList<>();
        
        while (in.hasNextLine()) {
                String[] v = in.nextLine().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                
                if (v[1].toUpperCase().trim().equals(gender) && v[2].trim().equals(year)){
                    names.add(v[3]);
                    
                    try {
                        cnts.add(Integer.parseInt(v[4].trim()));
                    } catch (NumberFormatException e){
                        System.out.println("Invalid Number");
                        continue;
                    }
                 }
            }
        
        
    }
    
    public boolean isValid() {
        return names.size() > 0;
    }
    public ArrayList<String> getNames() {
        return this.names;
    }
    public ArrayList<Integer> getCounts() {
        return this.cnts;
    }
    public Query extend(Query other) {
        ArrayList<String> names = other.getNames();
        for (int i = 0; i < names.size(); i++){
            for (int l = 0; l < this.names.size(); l++){
                if (this.names.get(l).equals(names.get(i))){
                    this.cnts.set(l, this.cnts.get(l)+other.getCounts().get(i));
                }
            }
        }
        
        return this;
    }
    public void display() {
        // TODO Just Display!
        int most_pop = 0;
        double total = 0;
        for (int i = 0; i < cnts.size(); i++){
            if (cnts.get(i) > cnts.get(most_pop)) { 
                most_pop = i; total +=cnts.get(i); 
            }
        }
        
        //String s = "The most popular " + gender  + " name in " + year + " was " + names.get(most_pop) +  ". " + cnts.get(most_pop) + " babies were born named " + names.get(most_pop) + " which made up " + cnts.get(most_pop) / total * 100 + "% of the births";
        
        //System.out.println(s);
    }
}
