package Aug.ex_18082024.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab_232 {
    public static void main(String[] args) {
        List myList= new ArrayList();
        myList.add(100);
        myList.add(120);
        myList.add(99);
        myList.add(89);
        myList.add(10);
        System.out.println(myList);         //[100, 120, 99, 89, 10]
        Collections.sort(myList);
        System.out.println(myList);         //[10, 89, 99, 100, 120]
        Collections.sort(myList, Comparator.reverseOrder());        //reverse
        System.out.println(myList);        //[120, 100, 99, 89, 10]
    }
}
