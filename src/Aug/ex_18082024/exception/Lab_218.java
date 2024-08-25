package ex_18082024.exception;

public class Lab_218 {

    //exception passing
    public static void main(String[] args) {
        extracted();
    }
    public static void extracted(){
        extracted1();
    }

    public static void extracted1(){
        try {
            Integer[] i= new Integer[2];
            System.out.println(i[3]);           //unchecked exception->ArrayIndexOutOfBounds
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("ArrayIndexOutOfBoundsException");//Index 3 out of bounds for length 2
        }

    }
}


/*

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
	at ex_18082024.exception.Lab_218.extracted1(Lab_218.java:15)
	at ex_18082024.exception.Lab_218.extracted(Lab_218.java:10)
	at ex_18082024.exception.Lab_218.main(Lab_218.java:7)


child->parent->grandparent-> UNTIL MAIN() IS NOT FOUND ----> this way exception is passed.
here line 15 passed the exception to line 10 and then line 10 to line 7. If not handled in line 15.

*/