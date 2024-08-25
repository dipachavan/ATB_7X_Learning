package ex_21072024;

public class Lab109 {
    public static void main(String[] args) {
        for (int i=0; i>1;i++){
            System.out.println(i);      // no output. condition is always false here.
        }
        System.out.println("*******");
        for (int i=0; i>=1;i++){
            System.out.println(i);      // no output. condition is always false here.
        }
        for (int i=0;;i++){
            System.out.println(i);      //Infinite loop until CPU is out of memory as no exit condition.
        }

    }
}
