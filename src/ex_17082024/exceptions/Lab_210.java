package ex_17082024.exceptions;

public class Lab_210 {
    public static void main(String[] args) {


        try {
            int a=100;
            int b=a/0;      //JVM does not know about this.
            System.out.println(b);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("divide by zero occurred.");
        }
        System.out.println("continued execution");
    }
}


//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at ex_17082024.exceptions.Lab_210.main(Lab_210.java:8)

//To avoid this , we can handle the code with try catch block and flow will be continued.
// JVM will print the message like below.
//We can print our own message too.

/*

Exception in thread "main" java.lang.RuntimeException: java.lang.ArithmeticException: / by zero
at ex_17082024.exceptions.Lab_210.main(Lab_210.java:12)
Caused by: java.lang.ArithmeticException: / by zero
at ex_17082024.exceptions.Lab_210.main(Lab_210.java:9)

 */


/*
when handled with try catch output is :

divide by zero occurred.
continued execution



*/
