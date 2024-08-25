package ex_04082024_OOPs;

public class Lab164 {
    public static void main(String[] args) {
        Car car= new Car();         //1st object
        //Car car= Car();       //an error will be thrown
        new Car();                  //2nd object
        // here 2 objects will be created in heap area where car(ref var) wil be pointed to one object
        // and another object is not pointed to anything(new Car()) as there is no reference variable.
        //So the constructor will be called 2 times.
    }

}


//Output will be:
/*

in C
in A
in R
in C
in A
in R

*/
