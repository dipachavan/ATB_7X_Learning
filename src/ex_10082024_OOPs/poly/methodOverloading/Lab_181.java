package ex_10082024_OOPs.poly.methodOverloading;

public class Lab_181 {
    //Polymorphism: different forms
    //It allows methods to perform different tasks based on the object that invokes them.
    //Types:
        /*1.Compile Time|Static|Method OverLoading
          2.Runtime|Dynamic|Method Overriding
         */

    public static void main(String[] args) {
        MathOperations mathOperations=new MathOperations("Deepa",1001);
        mathOperations.getName();
        int result1=mathOperations.add(10,12);
        String result2=mathOperations.add("Hello",123);
        int result3=mathOperations.add(12,45,100);
        mathOperations.add(12,12.2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
