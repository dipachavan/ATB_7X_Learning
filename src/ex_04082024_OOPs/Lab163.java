package ex_04082024_OOPs;

public class Lab163 {
    public static void main(String[] args) {
        Person p=new Person();      //object initialization.
        System.out.println(p.name);     // it will give null as no value is assigned yet.

        // Class loader is the first one called by JVM.It will load the person call when Person p
        // and all the variables will be assigned to null.

        //Heap Area contains objects. When new Person(), object is created in heap area.

        //Person p=new Person();
        //here Person is class name, p is a reference.
        // new is to create an object.Person() is a special method called as default constructor.
    }
}
