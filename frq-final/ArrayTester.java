import java.util.ArrayList;
/**
 * Write a description of class ArrayTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayTester
{
    public static void main(String[] args){
        int[][] array2d = {
            {0, 1, 2},
            {1, 2, 0},
            {2, 0, 1}
        };
        int[] a = {1, 2, 3};
        int[] b = {2, 1, 3};
        System.out.println(isLatin(array2d));
    }
    public static boolean checkAllIfIn(int[] a, int[] b){
        for (int i = 0; i < b.length; i++){
           for (int e = 0; e < b.length; e++){
                if (b[i] == a[e]){
                    a[e] = -1;
                    b[i] = -1;
                }
        
            } 
            if (b[i] != -1){
                return false;
            }
        }
        return true;
    }

    public static boolean isLatin(int[][] sq){
        // assume no duplicates in row 1
        
        for (int i =0; i < sq.length; i++){

            if (!checkAllIfIn(sq[i], sq[0]) || !checkAllIfIn(getCol(sq, i), sq[0])){
                return false;
            }
        }
        
      return true;
    }
    public static int[] getCol(int[][] a, int c){
        int[] f = new int[a.length];
        
        for (int i = 0; i < a.length; i++){
            f[i] = a[i][c];
        }
        return f;
    }
    }

