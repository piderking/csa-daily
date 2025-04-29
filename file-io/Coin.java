import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.ArrayList;



/**
 * Write a description of class Coin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coin
{
    private double value;
    private String name;
    
    public Coin(double aValue, String aName){
    this.value = value; this.name = name;
    }
    public Coin(){
    }
    public double getValue() {
        return this.value;
    }
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + " " + this.value;
    }
    public  void read(Scanner in) throws NoSuchElementException {
        if (in.hasNextLine()){
            String s = in.nextLine();
            int d = s.indexOf(" ");
            this.name = s.substring(0, d);
            this.value = Double.parseDouble(s.substring(d+1));
            return;
        }
        throw new NoSuchElementException();

    }
    static ArrayList<Coin> readFile(String filename) throws IOException
       {
          ArrayList<Coin> list = new ArrayList<Coin>();
                 
          try (Scanner in = new Scanner(new File(filename)))
          {
             boolean done = false;
             
             while (!done)
             {
                try
                {
                   Coin c = new Coin();
                   c.read(in);
                   list.add(c);
                }
                catch(NoSuchElementException exception)
                {
                   done = true;
                }
             }
          }
          return list;
       }



}
