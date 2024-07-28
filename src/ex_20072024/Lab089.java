package ex_20072024;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int age = sc.nextInt();

        if (age < 1) {
            System.out.println("infant");
        } else if (age <= 18) {
            System.out.println("not an Adult");
        } else
            System.out.println("U are an Adult");
    }
}