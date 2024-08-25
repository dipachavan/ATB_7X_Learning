package ex_18082024.exception;

import java.util.Scanner;

public class Lab_224 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int num= sc.nextInt();
        try {
            if(num == 0)
            {
                throw new ArithmeticException("Enter number greater than zero");
            }
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }
}
