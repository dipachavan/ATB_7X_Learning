package Aug.ex_18082024.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_234 {
    public static void main(String[] args) {
        List<String> list= new ArrayList();
        list.add("Deepa");
        list.add("Vilas");
        list.add("Chavan");
        System.out.println("****for each****");
        for (String str:list){
            System.out.println(str);
        }
        System.out.println("****for****");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("****Using Iterator****");
        Iterator itr= list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
