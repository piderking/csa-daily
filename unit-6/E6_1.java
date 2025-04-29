
/**
 * Write a description of class E6_1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class E6_1
{
    // instance variables - replace the example below with your own
    private int x;

    
    public static int sumOddsBetween(int a, int b)
    {
        int sum = 0;
        if (a % 2 != 1){a++;}
        do { 
            sum+=a;
            
            a += 2;
            
        } while (a <= b);
        
        return sum;
    }
    
    public static int sumOddsOfInput(int input){
        // input 32677
        int sum = 0;
        int count = 0;
        // ((int) (input / Math.pow(10,2)) % 10);
        do {
            
            int d = ((int) (input / Math.pow(10,count)) % 10);
            
            if (d % 2 == 1){
                sum += d;
            }
            
            count++;
        } while ((int) Math.pow(10, count) < input);
        
        return sum;
        
    }
}
