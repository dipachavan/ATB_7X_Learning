package ex_11082024.Interface.exInterface;

public interface Engine {
    void startEngine();
    void stopEngine();

    default void m1(){
        System.out.println("this is default method");
    }
    static void m2(){
        System.out.println("this is static method");
    }
}
