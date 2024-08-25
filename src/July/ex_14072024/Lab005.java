package ex_14072024;

public class Lab005 {
    public static void main(String[] args) {
        //increment(++) and decrement(--) operators
        //2 types pre and post
        //1.PRE-> value is incremented first and then stored in the result.
        int a_pre=5;
        int b=++a_pre;  //++a means that a=a+1;
        System.out.println(a_pre);  //6
        System.out.println(b);  //6
        //1.POST-> value is stored in the result first and then later incremented.
        int a_post=5;
        System.out.println(a_post++);   //5
        System.out.println(a_post);     //6
    }
}
