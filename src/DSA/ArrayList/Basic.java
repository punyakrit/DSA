package DSA.ArrayList;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(67);
        list.add(100);
        list.add(150);
        list.add(190);
        System.out.println(list);

        list.set(0,99);
        System.out.println(list);

    }
}
