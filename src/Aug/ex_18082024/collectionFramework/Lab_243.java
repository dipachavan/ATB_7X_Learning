package Aug.ex_18082024.collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Lab_243 {
    public static void main(String[] args) {
        Map<String,Integer> m1= new HashMap<String,Integer>();
        m1.put("Deepa",44);
        m1.put("Dipa",44);
        m1.put("D",32);
        m1.put("deepa",444);
        m1.put("deepa",444);
        m1.put("dipa",334);
        m1.put("dEePa",22);
        m1.put("ddd",null);
        m1.put(null,122);
       // m1.put("dEePa","See");
        System.out.println(m1);         //{null=122, D=32, deepa=444, ddd=null, Dipa=44, dEePa=22, Deepa=44, dipa=334}
        System.out.println(m1.isEmpty());       //false
        System.out.println(m1.size());              //6
        System.out.println(m1.containsKey("deepa"));        //true
        System.out.println(m1.containsValue("deepa"));      //false
        System.out.println(m1.keySet());                    //[null, D, deepa, ddd, Dipa, dEePa, Deepa, dipa]
        System.out.println(m1.get("D"));                    //32
        System.out.println(m1.get("ddd"));                 //return the value associated to the key   //null
        System.out.println(m1.values());                    //[122, 32, 444, null, 44, 22, 44, 334]
        //traversing
        System.out.println("Printing map");
        for (Map.Entry<String,Integer> item : m1.entrySet()){
            System.out.println(item.getKey()+"-> "+item.getValue());
        }
    }
}
/*

null-> 122
D-> 32
deepa-> 444
ddd-> null
Dipa-> 44
dEePa-> 22
Deepa-> 44
dipa-> 334


*/