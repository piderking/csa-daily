package E4_15;
import java.util.Scanner;  // Import the Scanner class


/**
 * Write a description of class Break here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Break
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object//     String userName = myObj.nextInt();  // Read user input

        double val = scanner.nextDouble();
        
        System.out.println(getStringPlace(val, 5) + getStringPlace(val, 4) + getStringPlace(val, 3) + getStringPlace(val, 2) + getStringPlace(val, 1));
        
        
    }
    public static int getPlace(double count, int place){
        return (int) (((count)/Math.pow(10.0, (double) place-1) % 10));
    }
    
    public static String getStringPlace(double count, int place){
        return getPlace(count, place) + " ";
    }
     
}
