import java.io.* ; 
import java.util.Scanner;
/**
 * Write a description of class Numbered here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Numbered
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Numbered
     */
    public static void main(String[] args)
    {
        String file_name = "dev.java";
        try {
            String temp = "";
            int cnt = 0;
            File file = new File(file_name);
            Scanner myReader = new Scanner(file);
             while (myReader.hasNextLine()) {
                //System.out.println("/*" + cnt + "*/" + myReader.nextLine() + "\n");
                temp += ("/*" + cnt + "*/" + myReader.nextLine() + "\n");
                cnt++;
            }
            FileWriter writer = new FileWriter(file_name);
            writer.write(temp);
            writer.close();
            System.out.println("Sucessfully Wrote the File");

        } catch (FileNotFoundException e){
            System.out.println("File wasn't found.");
              e.printStackTrace();
        } catch (IOException e){
            System.out.println("An error occurred when writing to the file.");
              e.printStackTrace();
        }
    }

}
