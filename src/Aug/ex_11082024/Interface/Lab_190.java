package ex_11082024.Interface;

public class Lab_190 {
    public static void main(String[] args) {
        //Engine engine= new Engine();        //Engine is abstract, can not be instantiated.
        WagonR wagonR=new WagonR();
        wagonR.startEngine();
        wagonR.stopEngine();
    }
}
