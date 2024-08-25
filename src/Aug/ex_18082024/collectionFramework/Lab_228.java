package Aug.ex_18082024.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab_228 {
    public static void main(String[] args) {
        //CollectionFramework

        //can add heterogeneous data
        ArrayList arrList= new ArrayList();
        arrList.add("Deepa");
        arrList.add("Vilas");
        arrList.add("Chavan");
        arrList.add(123);
        arrList.add(true);
        System.out.println(arrList);                            //[Deepa, Vilas, Chavan, 123, true]
        System.out.println(arrList.size());                     //5
        System.out.println(arrList.contains("Deepa"));          //true
        System.out.println(arrList.contains("Dipa"));          //false
        String name= (String) arrList.get(0);
        System.out.println(name);                               //Deepa

    }
}

