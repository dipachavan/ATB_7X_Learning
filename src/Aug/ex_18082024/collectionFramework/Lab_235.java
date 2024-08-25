package Aug.ex_18082024.collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab_235 {
    public static void main(String[] args) {
        List myList= new ArrayList();
        myList.add("Deepa");
        myList.add("Vilas");
        myList.add("Chavan");
        System.out.println(myList);         //[Deepa, Vilas, Chavan]

        Vector vector=new Vector();
        vector.add("Deepa");        //thread1
        vector.add("Vilas");        //thread2
        vector.add("Chavan");        //thread3
        System.out.println(vector);             //[Deepa, Vilas, Chavan]
        //vector is thread safe, synchronised.It will be time-consuming so slower.
    }
}
