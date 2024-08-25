package ex_17082024;

public class Lab_199 {
    public static void main(String[] args) {
        A a= new A();
        a.disc=52;          //non-static ,so object is required to access it.
        A.value=200;        //static, so with class name ,it can be accessed. No need of the object
        System.out.println(a.disc);
        System.out.println(A.value);
        System.out.println("--- 2nd object created then blocks will be executed,not static block ---");
        A a1= new A();
    }
}

class A{

    static int value;
    int disc=12;

    {
        System.out.println("called when object initiated block 1");
        //System.out.println("loaded whenever object is created");
    }
    static
    {
        System.out.println("called when class is loaded static block");
        //System.out.println("class is loaded only once hence static block is printed only once");
    }
    {
        System.out.println("called when object initiated block 2");
        //System.out.println("loaded whenever object is created");
    }
}


//output:
/*
called when class is loaded static block
called when object initiated block 1
called when object initiated block 2
52
200
--- 2nd object created then blocks will be executed,not static block ---
called when object initiated block 1
called when object initiated block 2
 */