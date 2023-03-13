package DSA.Arrays.Questions;

public class Max {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,50,6,7,8};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int res =arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>res){
                res = arr[i];
            }
        }

        return res;
    }
}
