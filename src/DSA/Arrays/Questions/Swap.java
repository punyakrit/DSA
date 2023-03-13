package DSA.Arrays.Questions;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6,7,8,9};

        Swapint(arr,3,6);
        System.out.println(Arrays.toString(arr));
    }

    private static void Swapint(int[] arr, int a, int b) {
        int temp = arr[a];
         arr[a] = arr[b];
         arr[b] = temp;
    }
}
