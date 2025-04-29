import java.util.ArrayList;
import java.io.IOException;
/**
 * Write a description of class CoinReader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CoinReader
{
    public static void main (String[] args) {
            System.out.println("sdfs");

            // -f <file_name>
            try {
                
                    ArrayList<Coin> coins = Coin.readFile("good.dat");
                    
                    for (int i = 0; i < coins.size(); i++){
                        System.out.println(coins.get(i).toString());
                    }

            } catch (IOException e) {
                System.out.println("File puked!");
                System.out.println(e.getStackTrace());
            } catch (RuntimeException e){
              e.printStackTrace();

            }
    
        
    }
}
