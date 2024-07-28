package ex_20072024;

import java.util.Scanner;

public class Lab104 {
    public static void main(String[] args) {
        //largest number between 3 numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number1");
        int num1=sc.nextInt();
        System.out.println("Enter your number2");
        int num2=sc.nextInt();
        System.out.println("Enter your number3");
        int num3=sc.nextInt();

        if(num1 > num2 && num1>num3){
            System.out.println("num1 is largest");
        } else if (num2>num1 && num2>num3) {
            System.out.println("num2 is largest");
        }
        else if (num1==num2 && num1==num3 && num2==num3){
            System.out.println("all numbers are same");
        }
        else System.out.println("num3 is largest");
    }
}
