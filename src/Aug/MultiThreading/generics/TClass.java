package Aug.MultiThreading.generics;

public class TClass {
    public static void main(String[] args)
    {
        Test<Integer> i= new Test<Integer>(10);
        System.out.println(i.getObj());
        Test<String> i2= new Test<String>("Deepa");
        System.out.println(i2.getObj());
        Test<Boolean> i3= new Test<Boolean>(true);
        System.out.println(i3.getObj());
    }

}
 class Test<T>{
    T obj;

     public T getObj() {
         return obj;
     }

     Test(T obj)
    {
        this.obj=obj;
    }
 }