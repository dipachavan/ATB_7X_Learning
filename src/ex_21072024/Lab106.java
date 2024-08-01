package ex_21072024;

public class Lab106 {
    public static void main(String[] args) {
        //LOOP-perform a task in repetitive in nature
//        for(A;B;C){
//            //task to perform repetitively
        //        }

        // A: initialization
        // B: condition for termination(When u want to stop)
        // C: increment or decrement(updation)

        for(int i=1;i<=10;i++){
            //task to perform repetitively
            System.out.println("Hellooo"+i);
        }

        //here in updation we can not write like i=i+1 because i=i+1 is a statement and for() is also a statement.
        // Statement inside statement is not allowed.

        //no difference if updation is written like ++1 because this is last line in the statement.
    }
}
