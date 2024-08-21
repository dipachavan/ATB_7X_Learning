package ex_11082024.exCar;

public class Car extends Engine{

    @Override
    void openCar() {
        System.out.println("open car");
    }

    @Override
    void stop() {
        System.out.println("stop car");
    }

    @Override
    void speed() {
        System.out.println("Speed is 180");
    }

    @Override
    void start() {
        System.out.println("start car");
    }

    @Override
    void partGearBox() {
        System.out.println("part of gear box of a car");
    }
}
