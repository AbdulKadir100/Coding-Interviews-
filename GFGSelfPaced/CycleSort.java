package GFGSelfPaced;

import java.util.Arrays;

import static GFGSelfPaced.Sorting.swap;

public class CycleSort {
    /*
    * Points to remember
    * Element should be continues like 1,2,3,4.....N.
    * Cycle sort is used to require only one pass,or single loop traversal
    * When given numbers from range 1, N use Cycle Sort
    * */

    public static void main(String[] args) {
         int[] arr = new int[]{3,5,2,1,4};
         cyclesort(arr);
    }
    /*
    * Problem:- Given an array sort it in just one pass with O(N)
    * arr = [ 3 , 5 , 2 , 1 , 4 ]
    * */
    private static void cyclesort(int[] arr){
        /*
        * approach
        * Pick index value swap it to its index minus one in its value
        * e.g, swap( index , arr[value]-1 )
        * TC-> O(N)
        * SC -> O(1)
        * */

        int i=0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }else {
                i++;
            }

        }

        System.out.println(Arrays.toString(arr));

    }
    private static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
