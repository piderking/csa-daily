
/**
 * Write a description of class E5_10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;  // Import the Scanner class

public class E5_10
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object//     String userName = myObj.nextInt();  // Read user input
        
        int num_pairs = 0;
        
        System.out.println("Number 1");
        int num1 = scanner.nextInt();
        
        System.out.println("Number 2");
        int num2 = scanner.nextInt();
        
        System.out.println("Number 3");
        int num3 = scanner.nextInt();
        
        System.out.println("Number 4");
        int num4 = scanner.nextInt();
        
        if (num1 == num2)num_pairs++;
        if (num1 == num3)num_pairs++;
        if (num1 == num4)num_pairs++;
        
        if (num2 == num3)num_pairs++;
        if (num2 == num4)num_pairs++;

        if (num4 == num3)num_pairs++;
        
        if (num_pairs >= 2)System.out.println("Two Pairs");
        else System.out.println("Two Pairs");




        
    }
}
