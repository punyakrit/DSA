package DSA.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int [] nums = {3 ,5, 7, 8,9};
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int arr[]){
        arr[2] = 55;
    }
}
