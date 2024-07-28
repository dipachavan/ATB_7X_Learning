package ex_20072024;

import java.util.Scanner;

public class Lab098 {
    public static void main(String[] args) {
        //JDK
        //in jdk 17, break is not required if -> is used
        int itemcode=005;
        switch (itemcode){
            case 001 -> System.out.println("laptop ");
            case 002 -> System.out.println("Desktop");
            case 003,004 -> System.out.println("Mobile");
            default -> System.out.println("Which device it is?");
        }
        System.out.println("**************************");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        char c= sc.next().charAt(0);   //nothing like nextChar so u can use like this to take input from user
        switch(c)
        {
            case 'a','e','i','o','u' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }
    /*
    output is as below:
    Which device it is?
    **************************
    enter a character
    p
    Consonant
    */


}


