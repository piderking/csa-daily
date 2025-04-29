package E4_11;
import java.util.Scanner;  // Import the Scanner class

/**
 * Write a description of class DriveConfigurator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DriveConfigurator
{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object//     String userName = myObj.nextInt();  // Read user input
    
        System.out.println("Enter Drive Name ex: C");
        String drive_name = scanner.nextLine() ;
        
        System.out.println("Enter the directory path ex: \\Windows\\System");
        String path = scanner.nextLine() ;
        
        System.out.println("Enter the file path ex: Readme");
        String file_path = scanner.nextLine() ;
        
        System.out.println("Enter the extension ex: txt");
        String extension = scanner.nextLine() ;
        
        System.out.println(drive_name + ":" + path + "\\" + file_path + "." + extension);
    }
}
