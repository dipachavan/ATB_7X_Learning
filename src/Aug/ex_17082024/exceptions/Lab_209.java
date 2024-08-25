package ex_17082024.exceptions;

public class Lab_209 {
    public static void main(String[] args) {
        String up= args[0];             //can throw ArrayIndexOutOfBounds if no value provided to the array
        int a= Integer.parseInt(up);    //can throw NumberFormatException if string value like "Deepa" is passed then will not able to convert it into integer.
        int b= 100/a;                   //can throw ArithmeticException if passed 0 then will not able to divide by 0.
        System.out.println(b);
    }
}
