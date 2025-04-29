package E4_16;
import java.util.Scanner;  // Import the Scanner class
import E4_15.Break;

/**
 * Write a description of class MilitaryConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MilitaryConverter
{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object//     String userName = myObj.nextInt();  // Read user input
        System.out.println("Time 1: ");
        int time1 = scanner.nextInt();
        System.out.println("Time 2: ");
        int time2 = scanner.nextInt();

        time1 = time1/100*60 + time1%100;
        time2 = time2/100*60 + time2%100;

        int ftime = Math.max(0, time2-time1) + ((24*60 - time1 + time2)*Math.max(time1-time2, 0))/Math.max(time1-time2, 1) ; 
        System.out.println((ftime/60) + " hours " + (ftime%60) + " minutes ");
        
    }
}
