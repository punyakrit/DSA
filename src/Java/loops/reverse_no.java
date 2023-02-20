package Java.loops;

public class reverse_no {
    public static void main(String[] args) {
        int no = 23597;
        int res =0;
        while (no>0){
            res = res*10 + no%10;
            no = no/10;
        }
        System.out.println(res);
    }
}
