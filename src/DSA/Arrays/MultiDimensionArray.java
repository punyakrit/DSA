package DSA.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
//    declaring 2-d array
//        int [][] arr =new int [3][];

//        initializing 2-d array

        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int [][] arr1 = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        System.out.println(Arrays.toString(arr));
    }
}
