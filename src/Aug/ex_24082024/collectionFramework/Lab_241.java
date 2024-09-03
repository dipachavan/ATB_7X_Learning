package Aug.ex_24082024.collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Lab_241 {
    public static void main(String[] args) {
        HashSet hs= new HashSet();
        hs.add("Deepa");
        hs.add("Chavan");
        hs.add("Deepa");
        hs.add("Dipa");
        System.out.println("Using Hashset, no order  will be maintained "+hs);  //Using Hashset, no order  will be maintained [Dipa, Deepa, Chavan]

        LinkedHashSet lhs= new LinkedHashSet();
        lhs.add("Deepa");
        lhs.add("Chavan");
        lhs.add("Deepa");
        lhs.add("Dipa");
        System.out.println("Using LinkedHashset,order  will be maintained "+lhs);   //Using LinkedHashset,order  will be maintained [Deepa, Chavan, Dipa]

        TreeSet ts= new TreeSet();
        ts.add("Deepa");
        ts.add("Chavan");
        ts.add("Deepa");
        ts.add("Dipa");
        //ts.add(null);
        System.out.println("Using TreeSet, automatically sorted "+ts);  //Using TreeSet, automatically sorted [Chavan, Deepa, Dipa]

        for(Object o : ts){
            System.out.println(o);
        }
        System.out.println("**********************");
        Iterator it= ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
