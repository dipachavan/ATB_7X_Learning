package Aug.ex_18082024.collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab_242 {
    public static void main(String[] args) {
        Map m1= new HashMap();          //dynamic method dispatch
        //HashMap m1= new HashMap();
        m1.put("name","Deepa");
        m1.put("rollno","111");
        m1.put("phnno","45644415");
        System.out.println(m1);         //{name=Deepa, rollno=111, phnno=45644415}

        Map m2= new LinkedHashMap();    //dynamic method dispatch
        //LinkedHashMap m2= new LinkedHashMap();
        m2.put("name","Deepa");
        m2.put("rollno","111");
        m2.put("phnno","45644415");
        System.out.println(m2);         //{name=Deepa, rollno=111, phnno=45644415}

        Map m3 = new TreeMap();     //dynamic method dispatch
        //TreeMap m3 = new TreeMap();
        m3.put("name","Deepa");
        m3.put("rollno","111");
        m3.put("accno","111dddd");
        m3.put("phnno","45644415");
        System.out.println(m3);            //sorted based on keys //{accno=111dddd, name=Deepa, phnno=45644415, rollno=111}

    }
}
