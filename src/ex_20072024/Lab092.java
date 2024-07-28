package ex_20072024;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        //Switch Condition-When  you have more than 2 conditions,then switch case is preferable.
        //Which day it is? Based on number entered.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7, I will tell ypu which day it is!");
        int day= sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Its monday");
                break;      // breaks out from the loop
            case 2:
                System.out.println("Its tuesday");
                break;
            case 3:
                System.out.println("Its wednesday");
                break;
            case 4:
                System.out.println("Its thursday");
                break;
            case 5:
                System.out.println("Its friday");
                break;
            case 6:
                System.out.println("Its saturday");
                break;
            case 7:
                System.out.println("Its sunday");
                break;
            default:
                System.out.println("Its not a day");

        }
        System.out.println("Outside of the switch case");
    }
}
