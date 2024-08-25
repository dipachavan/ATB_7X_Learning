package ex_17082024;

public class Lab_196 {
    public static void main(String[] args) {
        //primitive to wrapper class
        int a=29;
        Integer b=a;
        System.out.println(a);
        System.out.println(b);      // extra utilities added

        //wrapper to primitive
        Integer c=23;       //Auto boxing  int-> Integer
        int d=c;            //unboxing     Integer -> int
        System.out.println(c);
        System.out.println(d);

    }
}
