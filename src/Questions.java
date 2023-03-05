import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1 +n2 >= 6 ){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
