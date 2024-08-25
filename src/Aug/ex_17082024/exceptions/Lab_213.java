package ex_17082024.exceptions;

public class Lab_213 {
    public static void main(String[] args) {
        int b= 0;                   //can throw ArithmeticException if passed 0 then will not able to divide by 0.
        try {
            String up= args[0];             //can throw ArrayIndexOutOfBounds if no value provided to the array
            int a= Integer.parseInt(up);    //can throw NumberFormatException if string value like "Deepa" is passed then will not able to convert it into integer.
            b = 100/a;
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("end");
    }
}
