package ex_21072024;

import java.util.Scanner;

public class Lab133 {
    public static void main(String[] args) {
        //while=> initialization-condition-body-updation
        //do while=>initialization-body-updation-condition
        // do is executed at least once
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){           //if more conditions then apply those first
                System.out.println(i+" FizzBuzz");
            }
            else if (i%3==0) {
                System.out.println(i+" Fizz");
            }
            else if (i%5==0)
            {
                System.out.println(i+" Buzz");
            }
            else System.out.println(i);
        }
    }
}
