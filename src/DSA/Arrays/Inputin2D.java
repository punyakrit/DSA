package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Inputin2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [3][3];

        // input in arrays

//        input in rows
        for (int row = 0; row < arr.length ; row++) {
//          input in cols
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

//        output of 2-d array

//        for (int row = 0; row < arr.length ; row++) {
////          input in cols
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

//        another way to print output

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

    }

}
