package ex_11082024.exCar;

public class Lab_187 {
    public static void main(String[] args) {

        //User is just driving the car, unaware of the implementation of car
        Tesla tesla= new Tesla();
        tesla.driveTesla();
        System.out.println("************");
        Brezza brezza=new Brezza();
        brezza.driveBrezza();
        System.out.println("************");
        Audi audi= new Audi();
        audi.driveAudi();
    }
}


//output:

/*

Driving Tesla
open car
start car
part of gear box of a car
stop car
************
Driving Brezza
open car
start car
part of gear box of a car
stop car
************
Driving Tesla
Open Audi
Start Audi
Speed of Audi
gear box of an Audi
Stop Audi

*/