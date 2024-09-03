package Aug.MultiThreading.generics;

public class GenericsDemo {
    public static void main(String[] args) {
        printT(1);
        printT("deepa");
        printT(true);
        printT(2.3);

    }

    public static <T> void printT(T a)           //this is generics, it can take any data type(<T>).
    {
        System.out.println(a);

    }
}
