package Aug.ex_18082024.collectionFramework;

import java.util.List;

public class Lab_230 {
    public static void main(String[] args) {
        List myList=List.of("I1","I2","I3");        //of is static function of List Interface.It is a complete function.
        System.out.println(myList);
        System.out.println(myList.size());
        myList.add("Banana");                       //add is a incomplete function of List Interface.Hence,it will throw an exception.
        /*
        Exception in thread "main" java.lang.UnsupportedOperationException
	    at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
	    at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
	    at Aug.ex_18082024.collectionFramework.Lab_230.main(Lab_230.java:10)
*/
    }
}
