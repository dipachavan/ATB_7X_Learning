package Aug.ex_18082024.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab_231 {
    public static void main(String[] args) {
        List list= new ArrayList();
        list.add("D");
        list.add("e");
        list.add("e");
        list.add("p");
        list.add("a");
        System.out.println(list);                    //[D, e, e, p, a]
        System.out.println(list.size());                //5
        System.out.println(list.isEmpty());         //false
        System.out.println(list.remove("e"));   //first occurrence will be removed
        System.out.println(list);                   //[D, e, p, a]
        System.out.println(list.remove(1));     //e
        System.out.println(list.removeAll(list));   //true
        System.out.println(list.isEmpty());         //true
        list.add("DipaChavan");
        list.add("DipaChavan");
        list.add("DipaChavan");
        list.add("DipaChavan");
        list.set(1,"DeepaCHavan");      //replaces
        System.out.println(list);
        list.add(true);
        list.add(1.2F);
        list.add(22);
        System.out.println(list);
        System.out.println("-------- printing using for loop -------");
        //to print
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-------- printing using for each loop -------");
        for (Object o:list){            //here object is used because list contain heterogeneous elements
            System.out.println(o);
        }

    }
}
