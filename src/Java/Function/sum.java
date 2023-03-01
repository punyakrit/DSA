package Java.Function;

import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
//        sum();

//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(10,5);
        System.out.println(ans);
    }

// pass the values
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;

    }



    //returning value of sum
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2 : ");
        int n2=sc.nextInt();
        return n1+n2;

    }


    //printing value
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2 : ");
        int n2=sc.nextInt();
        System.out.println("Sum is : "+ (n1+n2));
    }
}
