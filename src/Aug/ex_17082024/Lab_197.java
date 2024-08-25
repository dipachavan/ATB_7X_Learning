package ex_17082024;

public class Lab_197 {
    public static void main(String[] args) {
        String value="10";
        //int num=(int)value;         //inconvertible types
        Integer num=Integer.getInteger(value);      //with wrapper classes we can get int value of a string data type variable.
        System.out.println(value);          //10

        //string to primitive using wrapper
        int a= Integer.parseInt(value);      //unboxing
        System.out.println(a);              //10
    }
}
