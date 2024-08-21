package ex_11082024.Interface.exInterface;

public class ExampleClass
{
    public static void main(String[] args) {
        Car car= new Car();
        car.engineStart();
    }
}

interface EngineEx
{
    void engineStart();
}

class Car implements EngineEx{
    @Override
    public void engineStart() {
        System.out.println("engine started");
    }
}