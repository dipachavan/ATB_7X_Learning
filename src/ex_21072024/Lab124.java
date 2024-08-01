package ex_21072024;

public class Lab124 {
    public static void main(String[] args) {
        for (int i=0;i<=50;i++){
             if(i%2==0){
                System.out.println("Even->"+i);
                break;         // if condition is true then break this loop
            }
            System.out.println("Odd->"+i);
        }
        }
    }

    //Output:
/*
Even->0

*/
