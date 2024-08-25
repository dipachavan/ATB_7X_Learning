package ex_14072024;

public class Lab008 {
    public static void main(String[] args) {
        String s="DEEPA";
        //String is bunch of characters
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.length()); //5
        System.out.println(s.charAt(4)); //A
        System.out.println(s.charAt(3)); //A
        System.out.println(s.charAt(0)); //D
        //System.out.println(s.charAt(6)); //Exception:Index 6 out of bounds for length 5


        //@ ways to create STRING
        // 1) new operator
        // 2) Assignment operator

        String name="Deepa";    // This kind of string will be stored in SCP.
        String name1=new String("Deepa");   //This kind of string will be stored in HEAP.
        // Both of above statements will save values on different ways.
        //SCP(String Constants Pool) and HEAP

        //String is immutable in nature.
        name="Dipa";
        // Here now name is pointing to Dipa in SCP and Deepa will float in the pool.
        // It will be roaming around in the pool.So Deepa will be always there, you can not change this. SO STRINGS are IMMUTABLE.

        name="Chavan";
        name="Deepa";

        // so here 3 string are created(Deepa,Dipa and Chavan). now name is pointed to Deepa and rest 2 are floating in SCP.
        //THis is immutability i.e. reusability.

        String var=new String("Deepa");
        String var1=new String("Deepa");
        // 2 strings, in HEAP area
        String var2=var;
        // 2 string, in HEAP area, s3 --> s1==>Deepa
        System.out.println(var2);       //Deepa
        String var3=var2.toLowerCase(); //deepa
        System.out.println(var);    //Deepa
        //2 strings, Deepa and deepa floating in SCP
    }
}
