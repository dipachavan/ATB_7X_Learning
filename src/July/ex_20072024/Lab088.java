package ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        //find maximum number between 2 numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        // 1st Approach
        System.out.println("Maximum number is " +Math.max(num1,num2));

        //2nd Approach
        if(num1 > num2){
            System.out.println(num1+" num1 is greater than num2 " +num2);
        }
        else if (num2 > num1){
            System.out.println(num2+" num2 is greater than num1 " +num1);
        }
        else
            System.out.println( num1+" "+num2+" num1 and num2 are equal");
    }
    /*
    Output will be as follow:
    Enter num1
    22
    Enter num2
    120
    Maximum number is 120
    120 num2 is greater than num1 22

    if equal numbers are entered
    Enter num1
    100
    Enter num2
    100
    Maximum number is 100
    100 100 num1 and num2 are equal
    */

}
