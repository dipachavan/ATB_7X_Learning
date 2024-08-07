package ex_27072024;

import java.util.Scanner;

public class Lab146 {
    public static void main(String[] args) {
        //take 5 subjects marks and give average
        Scanner sc=new Scanner(System.in);
        float marks[]= new float[5];
        System.out.println("Enter marks for sub 1");
        marks[0]= sc.nextFloat();
        System.out.println("Enter marks for sub 2");
        marks[1]= sc.nextFloat();
        System.out.println("Enter marks for sub 3");
        marks[2]= sc.nextFloat();
        System.out.println("Enter marks for sub 4");
        marks[3]= sc.nextFloat();
        System.out.println("Enter marks for sub 5");
        marks[4]= sc.nextFloat();

        float avg= (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("avg is: "+avg);

        //2nd approach using for loop
        System.out.println("*****Using For loop*****");
        for(int i=0; i<marks.length;i++){
            System.out.println("enter marks for subject"+(i+1));
            marks[i]=sc.nextFloat();
        }
        // to see the marks entered
        for(int i=0; i<marks.length;i++){
            System.out.println("marks for subject "+(i+1)+" "+marks[i]);
        }
        float avg1= (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("avg is: "+avg1);
        sc.close();
    }
}
