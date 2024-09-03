package Aug.ex_24082024.collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab_236 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add("Deepa");
        linkedList.add("Vilas");
        linkedList.add("Chavan");
        linkedList.add("103");
        linkedList.add("1st Floor");
        linkedList.add("416505");
        System.out.println(linkedList);     //[Deepa, Vilas, Chavan, 103, 1st Floor, 416505]

        ArrayList arrayList=new ArrayList();
        arrayList.add("Deepa");
        arrayList.add("Vilas");
        arrayList.add("Chavan");
        arrayList.add("103");
        arrayList.add("1st Floor");
        arrayList.add("416505");
        System.out.println(arrayList);      //[Deepa, Vilas, Chavan, 103, 1st Floor, 416505]


    }
}
