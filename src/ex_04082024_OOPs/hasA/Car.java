package ex_04082024_OOPs.hasA;

public class Car {

    //Aggregation-HasA relationship
    void startTheCar()
    {
        new Engine().starting();
        new Tyres().rolling();
    }
}

