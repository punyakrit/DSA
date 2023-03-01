package Java.Function;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String val = gre(name);
        System.out.println(val);

//        String message = greet();
//        System.out.println(message);
    }

    private static String gre(String name) {
        return "hello "+name;
    }

    static String greet(){
        String greeting = "Hello";
        return greeting;
    }

}
