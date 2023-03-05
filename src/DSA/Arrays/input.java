package DSA.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];

        // arrays of premitives
//        arr[0] = 10;
//        arr[1] = 13;
//        arr[2] = 15;
//        arr[3] = 17;
//        arr[4] = 19;
//        System.out.println(arr[2]);

//        input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }


        // ways to print array

//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }

        System.out.println(Arrays.toString(arr));


//        Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
