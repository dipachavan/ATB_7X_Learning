package ex_10082024_OOPs.superKeyword;

public class Lab_183 {
    public static void main(String[] args) {
        Car car= new Car();
        car.display();
    }
}

class Car extends Vehicle
{
    int speed=180;

    Car(int speed) {
        //super(100);     //Super keyword should be first line in constructor.Calling a constructor in another constructor is called as constructor chaining
        //super();        //Only one explicit constructor call is allowed in constructor
        this.speed = speed;
    }
    Car() {
        super(100);      //Super keyword should be first line in constructor.Calling a constructor in another constructor is called as constructor chaining
        //super();             //Only one explicit constructor call is allowed in constructor
        //this(34);            //Only one explicit constructor call is allowed in constructor.Either this or super
        this.speed = speed;
    }


    void display(){
        System.out.println("Cars speed is "+this.speed);        //current
        System.out.println("Vehicles speed is "+super.speed);   //parent
        super.show("Deepa");        //with super keyword you can access members of parent class but access modifier should not be private
        this.show();
        super.show();
    }
    @Override
    void show(){
        System.out.println("in Car class");
    }
}

class Vehicle{
    //private int speed=180;        if its private you can not access it in child class. Exception will be thrown as java: speed has private access in ex_10082024_OOPs.superKeyword.Vehicle
    int speed=180;

    Vehicle(int speed) {
        this.speed = speed;
    }

    public Vehicle() {
        System.out.println("Parent DC");
    }

    //Overloading
    void show(){
        System.out.println(" in vehicle class");
    }
    void show(String name){
        System.out.println(" in vehicle class with arguments");
    }
}
