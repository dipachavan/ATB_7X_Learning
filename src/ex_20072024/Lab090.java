package ex_20072024;

import java.util.Scanner;

public class Lab090 {
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
        //Approach 1
        if(per >90 && per <100)
        {
            System.out.println("Grade A");
        }
        else if(per >=80 && per <89){
            System.out.println("Grade B");
        }
        else if(per >=70 && per <79){
            System.out.println("Grade C");
        }
        else if(per >=60 && per <69){
            System.out.println("Grade D");
        }
        else if(per == 59){
            System.out.println("Failed");
        }
        else {
            System.out.println("You have entered invalid percentage");
        }


    sc.close();
    }
}
