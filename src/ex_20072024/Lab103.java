package ex_20072024;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        //check is number is -ve or +ve
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();
        if(num > 0){
            System.out.println("POSITIVE");
        }
        else if(num<0)
            {
                System.out.println("NEGATIVE");
            }
        else {
            System.out.println("ZERO");
        }

    }
}
