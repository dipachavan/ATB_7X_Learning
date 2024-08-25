package ex_20072024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        //take user input as a char and tell user if its an vowel or not
        //aieou->vowels
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char c= sc.next().charAt(0);   //nothing like nextChar so u can use like this to take input from user
        switch (c){
            case 'a':
                System.out.println("a is an vowel");
                break;
            case 'e':
                System.out.println("e is an vowel");
                break;
            case 'i':
                System.out.println("i is an vowel");
                break;
            case 'o':
                System.out.println("o is an vowel");
                break;
            case 'u':
                System.out.println("u is an vowel");
                break;
            default:
                System.out.println("it is a consonant");
        }
    }
}
