package Aug.ex_18082024.collectionFramework;

import java.util.ArrayList;

public class Lab_229 {
    public static void main(String[] args) {
        int[] a= new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;

        //check if array has 3 in it
//        for (int i=0;i<a.length;i++)
//        {
//            if(a[i]==3)
//            {
//                System.out.println("3 is found");
//            }
//        }

        //same we can do with less code using collection framework
        ArrayList arrList= new ArrayList();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        System.out.println(arrList.contains(3));        //true



    }
}
