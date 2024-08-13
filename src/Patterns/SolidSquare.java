package Patterns;

import java.util.Scanner;

public class SolidSquare {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int r=sc.nextInt();
        System.out.println("Enter no. of columns");
        int c=sc.nextInt();
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
 // Output is
 /*
 Enter no. of rows
    5
 Enter no. of columns
    5
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *

  */