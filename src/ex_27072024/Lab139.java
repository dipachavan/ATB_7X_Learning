package ex_27072024;

import java.util.Scanner;

public class Lab139 {
    public static void main(String[] args) {
        //NOTE:If u have a exception at line no. 1 then nothing will print.
        // e.g.System.out.println(arr[5]);   //ArrayIndexOutOfBoundsException: Index 5
        //Arrays can be created with new keyword as well.
        int arr[]=new int[3];       // length is 3, indexing 0 1 2
        System.out.println(arr[0]);   //0
        System.out.println(arr[1]);   //0
        System.out.println(arr[2]);   //0
        arr[0]=100;
        arr[1]=90;
        arr[2]=80;
        System.out.println(arr[0]);   //100
        System.out.println(arr[1]);   //90
        System.out.println(arr[2]);   //80

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        arr[0]=sc.nextInt();
        arr[1]=95;
        arr[2]=88;
        System.out.println(arr[0]);   //1000
        System.out.println(arr[1]);   //95
        System.out.println(arr[2]);   //88
       // System.out.println(arr[5]);   //ArrayIndexOutOfBoundsException: Index 5
        System.out.println("*************************");
        for(int i=0;i< arr.length;i++){
            //i=0,1,2 here length is 3 and 3<3 so condition is false.
            System.out.println("i->"+"at "+i+": "+arr[i]);
            //output as below:
            //i->at 0: 2222
            //i->at 0: 95
            //i->at 0: 88

        }

        String days[]={"Sun","Mon","Tue","Wed","Thur"};
        for(int i=0;i<days.length;i++){
            // here as soon as i=5,condition will be true i.e. 5<=5. But there is no value at the position of 5.
            //So exception will be thrown as ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5.
            //So condition is like i< days.length. Hence i<5 condition will be false when i=5.SO loop will continue until i is 4 that is 5th position.
            System.out.println(days[i]);        //Sun Mon Tue Wed Thur   ----> in next line
        }



    }
}

