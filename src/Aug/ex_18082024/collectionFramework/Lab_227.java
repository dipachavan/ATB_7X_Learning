package Aug.ex_18082024.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab_227 {
    public static void main(String[] args) {
        //CollectionFramework


        ArrayList arrList= new ArrayList();
        List myList= new ArrayList();           //dynamic method dispatch-> parent ref to child object
        Collection coll= new ArrayList();       //dynamic method dispatch-> grandparent ref to grandchild object
    }
}
