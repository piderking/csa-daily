
/**
 * Write a description of class ZIPtoBarCode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ZIPtoBarCode
{
    public static String convertZIP(int[] narray){
        
        int sum = 0;
        for (int i : narray){
            sum += i;
        }
        int checkdigit =  ((int) Math.round((double) sum / 10)) * 10 - sum;
        
        int[] array = new int[narray.length + 1];       
        
        for (int y = 0; y < narray.length; y++){
            array[y] = narray[y];
        }
        array[narray.length] = checkdigit;
        int[] checks = {7, 4, 2, 1};
        String out = "|";
        for (int i : array){
            if (i == 0){
                out += "||:::";
                continue;
            }
            int count = 0;
            for (int d : checks){
                if (i - d >= 0) {
                    count++;
                    i -= d;
                    out += "|";
                } else {
                    out += ":";
                }
            }
            if (count == 1){
                out += "|";
            } else {
                out += ":";
            }
        }
        return out + "|";
    }
}
