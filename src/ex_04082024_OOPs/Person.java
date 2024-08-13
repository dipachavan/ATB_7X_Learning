package ex_04082024_OOPs;

public class Person {

    String name;            //atrribute

    //Special method which has a name of its class. Known as constructor
    Person()
    {
        System.out.println(" I will be called when object is created");
    }

    void talk()             //behaviour
    {
        System.out.println("talking");
    }
}
