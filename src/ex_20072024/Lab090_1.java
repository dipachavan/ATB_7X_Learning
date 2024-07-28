package ex_20072024;

import java.util.Scanner;

public class Lab090_1 {
    public static void main(String[] args) {
        //Grade calculator
        //A:90-100
        //B:80-89
        //C:70-79
        //D:60-69
        //F:0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percentage");
        int per = sc.nextInt();
        char grade='F';
        //Approach 2 , using char data type to print grade
        if(per >90 && per <100)
        {
            grade='A';
        }
        else if(per >=80 && per <89){
            grade='B';
        }
        else if(per >=70 && per <79){
            grade='C';
        }
        else if(per >=60 && per <69){
            grade='D';
        }
        else if(per >100 || per <0){
            System.out.println("You have entered invalid percentage");
            grade='O';
        }
        else {
            grade='F';
        }
        System.out.println("Your garde is : "+grade);
        sc.close();
    }
}
