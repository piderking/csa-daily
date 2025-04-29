import java.util.Arrays;

/**
 * Write a description of class RecurssiveMergeSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecurssiveMergeSort
{
    public static void main(String[] args){
        int[] arr1 = {1, 4, 5, 3, 4};
        int[] arr2 = {};
        
        System.out.println("\nHelper:");
        int[] m = mergeSortHelper(arr1);
        for (int i : m){
            System.out.print(i + ", ");
        }
    
    }    
    public static int[] mergeSort(int[] arr){
        return mergeSortHelper(arr);
    }
    public static int[] mergeSortHelper(int[] arr){
        
        if (arr.length <= 1){
            return arr;
        }
        // length: 2 --> middle = 1 [x] [x]
        // length: 3 -> middle = 1 [x] [x,x]
        // length: 10 --> middle 5 [x, x, x, x, x] [x, x, x, x, x]
        
        int middle = arr.length / 2;
        
        int[] arr1 =  new int[middle];
        int[] arr2 =  new int[arr.length - middle];
        
        for (int i = 0; i < arr1.length; i ++){
            arr1[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i ++){
            arr2[i] = arr[i];
        }
        
        return  merge(mergeSortHelper(arr1),mergeSortHelper(arr2));
    }
    
    public static int[] merge (int[] nums1, int[] nums2){
         int[] merged = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            merged[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            merged[k++] = nums2[j++];
        }
        return merged;
    }
}
