package Java.loops;

public class conditions {
    public static void main(String[] args) {
        // syntax of if statements

        int salary =14500;
        /*
        if(salary >5000){
            salary = salary+1990;
        }
        else {
            salary= salary+5990;
        }
         */
//        System.out.println(salary);

//multiple if else statements

        if(salary >5000){
            salary+=500;
        } else if (salary>20000) {
            salary+=345;
        }else {
            salary+=100;
        }
        System.out.println(salary);

    }
}
