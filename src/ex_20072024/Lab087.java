package ex_20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        //taking input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");       //if u enter a string or float value then an exception will be thrown
        //Exception in thread "main" java.util.InputMismatchException
        int user_num=sc.nextInt();
        System.out.println("you have entered: "+user_num);
        if(user_num%2 == 0)
        {
            System.out.println("You have entered an EVEN number");
        }
        else {
            System.out.println("You have entered an ODD number");
        }
        /*
        Output is as below if odd number entered:
        Enter a number
        123
        you have entered: 123
        You have entered an ODD number
        */

        /*
        Output is as below if even number entered::
        Enter a number
        1340
        you have entered: 1340
        You have entered an EVEN number
        */


    }
}
