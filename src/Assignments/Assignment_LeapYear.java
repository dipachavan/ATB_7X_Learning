package Assignments;

import java.util.Scanner;

public class Assignment_LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter year");
        int year=sc.nextInt();
        if(year % 4 ==0) System.out.println("Leap Year");
        else System.out.println("Not a leap year");
    }
}
