package ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you name");
        String name=sc.next();
        System.out.println("Enter you age");
        int age=sc.nextInt();
        System.out.println("Enter you salary");
        double salary=sc.nextDouble();
        System.out.println("Your name is :"+name);
        System.out.println("Your age is :"+age);
        System.out.println("Your salary is :"+salary);
        sc.close();
    }
}
