
import java.util.Scanner;  // Import the Scanner class

public class Store
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        Invoice voice = new Invoice();
        while (true){
            System.out.println("Input Item Price");
            while (!in.hasNextDouble()){
                System.out.println("Invalid Price");
            }
            double price = in.nextDouble();
            System.out.println("Input Item Quantity");
            while (!in.hasNextInt()){
                System.out.println("Invalid Quantity");
            }
            int quan = in.nextInt();
            
            System.out.println("Is Pet (y/n)");
            while (!in.hasNext()){
                System.out.println("Invalid synbol");
            }
            voice.add(new Item(price, in.next().toLowerCase().charAt(0) == 'y', quan));
            
            System.out.println("Discount is " + voice.getDiscount());
            
            System.out.println("More Items? (y/n)");
            while (!in.hasNext()){
                System.out.println("Invalid synbol");
            }
            if (in.next().toLowerCase().charAt(0) == 'n'){
                break;
            }
        
        }
    }    
}
