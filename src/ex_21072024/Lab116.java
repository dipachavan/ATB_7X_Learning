package ex_21072024;

public class Lab116 {
    public static void main(String[] args) {
        int i=10;
//        for (;i>0;i--){
//            System.out.println(i);          // 10 to 1
//        }
        boolean b1=i>0;
        for(;b1;i--){
            System.out.println(i);          //infinite loop as condition is always true
        }
    }
}
