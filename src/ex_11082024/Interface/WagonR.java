package ex_11082024.Interface;

public class WagonR implements Engine{
    @Override
    public void startEngine() {
        System.out.println(" started by WagonR");
    }

    @Override
    public void stopEngine() {
        System.out.println(" stopped by WagonR");
    }
}
