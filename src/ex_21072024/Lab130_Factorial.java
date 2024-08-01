package ex_21072024;

import java.util.Scanner;

public class Lab130_Factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number,will print its factorial");
        int n= sc.nextInt();
        for (int i=1; i<=n;i++){
            fact= fact * i;
        }
        System.out.println("Factorial of "+n+" is:"+fact);
        sc.close();
    }
}
