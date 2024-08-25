package ex_21072024;

public class Lab123 {
    public static void main(String[] args) {
        for (int i=0;i<=50;i++){
             if(i%2==0){
                System.out.println("Even->"+i);
                continue;         // if condition is true then go back and dont execute the next line code.
            }
            System.out.println("Odd->"+i);
        }
        }
    }

    //Output:
/*
Even->0
Odd->1
Even->2
Odd->3
.
.
.
Odd->49
Even->50

*/
