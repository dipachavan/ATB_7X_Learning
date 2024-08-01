package ex_21072024;

public class Lab132 {
    public static void main(String[] args) {
        //while=> initialization-condition-body-updation
        //do while=>initialization-body-updation-condition
        // do is executed at least once

        int i=10;
        while (i<10)
        {
            System.out.println(i);      // condition is false,no output
            i++;
        }
        System.out.println("***********************************");
        do {
            System.out.println(i);          // 10
            i++;
        }while (i<10);
    }
}
