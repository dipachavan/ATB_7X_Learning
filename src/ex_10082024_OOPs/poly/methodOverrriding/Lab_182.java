package ex_10082024_OOPs.poly.methodOverrriding;

public class Lab_182 {
    //Method overriding|Runtime polymorphism
    public static void main(String[] args) {
        Sheru sheru= new Sheru();
        sheru.bark();       //Sheru is barking  ---> from Sheru
        //Priority is always given to the local method, so above message is printed.
        sheru.greet();

        Dog dog= new Dog();
        dog.bark();        //Barking  --> from Dog


        Dog d1= new Sheru();
        d1.bark();      //Sheru is barking.
        // which method to call is based on the object(RHD)
        //With parent reference, only overridden methods can be accessed.
        //d1.greet();       //This method is not accessible with parent reference
        //Sheru sh= new Dog();      --> this is invalid becuase parent can not access childs members.

        //Here child can not be available before parents existence,so child can not be a reference variable to the parent.
    }
}
