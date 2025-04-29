
/**
 * Write a description of class E5_7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;  // Import the Scanner class

public class E5_7
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object//     String userName = myObj.nextInt();  // Read user input
        
        System.out.println("Number 1");
        int num1 = scanner.nextInt();
        
        System.out.println("Number 2");
        int num2 = scanner.nextInt();
        
        System.out.println("Number 3");
        int num3 = scanner.nextInt();
        
        if (num1 < num2 && num2 < num3){ System.out.println("Increasing...");}
        else if (num1 > num2 && num2> num3){ System.out.println("Decreasing...");}
        System.out.println("neither");
        
        
    }
}
