package ex_21072024;

public class Lab107 {
    public static void main(String[] args) {
        for(int deepa=1;deepa<5;deepa++){
            System.out.println(deepa);      //5<5,condition will be false.so output will be 1 to 4.
        }
        System.out.println("***************************");
        for(int deepa=1;deepa<=5;deepa++){
            System.out.println(deepa);      //5<=5,condition will be true.so output will be 1 to 5.
        }
    }
}

//output is as below:
//        1
//        2
//        3
//        4
//       ***************************
//        1
//        2
//        3
//        4
//        5
//
