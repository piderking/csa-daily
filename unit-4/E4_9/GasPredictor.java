package E4_9;

import java.util.Scanner;  // Import the Scanner class

/**
 * Write a description of class GasPredictor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GasPredictor
{

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object//     String userName = myObj.nextInt();  // Read user input
    
        System.out.println("Number of Gallons in Tank");
        double gallons = myObj.nextDouble() ;
        
        System.out.println("Average Efficency of Car (mile/gallon)");
        double effic = myObj.nextDouble();
        
        System.out.println("Price per Gallon of Gass");
        double price = myObj.nextDouble();
        
        System.out.println("Cost per 100 miles: "  + price * 100.0);
        System.out.println("Can travel: "  + effic * gallons);

        

        

    }

}
