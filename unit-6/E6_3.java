
/**
 * Write a description of class E6_3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class E6_3
{
    // instance variables - replace the example below with your own
    public static String getUpperCase(String str){
        String f = "";
        for (int d = 0; d < str.length(); d++){
            if(str.substring(d, d+1).equals(str.substring(d, d+1).toUpperCase()));
            f += str.charAt(d);
        }
        return f;

    }
    public static String replaceVowels(String str){
        return str.toLowerCase().replace("a", "_").replace("e", "_").replace("i", "_").replace("o", "_").replace("u", "_");
    }
}
