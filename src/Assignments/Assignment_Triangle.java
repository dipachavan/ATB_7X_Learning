package Assignments;

import java.util.Scanner;

public class Assignment_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1");
        int side1=sc.nextInt();
        System.out.println("Enter side 2");
        int side2=sc.nextInt();
        System.out.println("Enter side 2");
        int side3=sc.nextInt();

        if(side1==side2 && side2==side3 && side1==side3){
            System.out.println("Equilateral Triangle,all sides are equal");
        }
        else if(side1==side2 || side2==side3 || side1==side3){
            System.out.println("Isosceles Triangle,2 sides are equal");
        }
        else
            System.out.println("Scalene Triangle,no sides are equal");
    }
}
