import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=1;i<=t; i++){
            int n = sc.nextInt();
            int [] arr = new int [n];

            for (int j=0;j<arr.length ;j++ ){
                arr[j] = sc.nextInt();

            }

            int count = 0;

            for (int j=0;j<arr.length ;j++ ){
                if(arr[j]>1000){
                    count++;
                }
            }
            System.out.println(count);

        }

    }
}

