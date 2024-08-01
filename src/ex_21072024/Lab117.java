package ex_21072024;

public class Lab117 {
    public static void main(String[] args) {
        for (int i=0;i>1;i++){
            System.out.println("Deepa");
        }
        System.out.println("At the END");

        System.out.println("*************");
        for (int i=0;i<10;i++){
            System.out.println("Deepa->"+i);
        }
        System.out.println("At the END");

//        for (int i=0;i>1;){
//            System.out.println("Deepa");            //infinite loop as no condition
//        }
    }
}


// here condition is always false so it will not enter inside the loop
//output will be:
/*
At the END
*************
Deepa->0
Deepa->1
Deepa->2
Deepa->3
Deepa->4
Deepa->5
Deepa->6
Deepa->7
Deepa->8
Deepa->9
At the END
*/