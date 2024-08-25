package ex_11082024.exCar;

public class Audi extends Engine
{
    @Override
    void start()
    {
        System.out.println("Start Audi");
    }

    @Override
    void stop()
    {
        System.out.println("Stop Audi");
    }

    @Override
    void partGearBox()
    {
        System.out.println("gear box of an Audi");
    }

    @Override
    void openCar()
    {
        System.out.println("Open Audi");
    }

    @Override
    void speed() {
        System.out.println("Speed of Audi");
    }

    void driveAudi()
    {
        System.out.println("Driving Tesla");
        openCar();
        start();
        speed();
        partGearBox();
        stop();

    }
}
