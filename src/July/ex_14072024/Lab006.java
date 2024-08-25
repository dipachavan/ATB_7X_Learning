package ex_14072024;

public class Lab006 {
    public static void main(String[] args) {
        //increment and decrement operators
        int a=100;
        System.out.println(a++);    //value of a will 100 only as it will first assign the value and then increment
        System.out.println(++a);    //value of a will 102 as it will increment first and then assign the value
        //here value will 102 because with a++ value is incremented to 101 and in 2nd statement,1 is added to that 101 and then assigned.Hence variable a is 102.

        int A =100;
        System.out.println(++A + A++);  //202          sum of expression values
        //A--> a++  EXP=100,a=101
        // +
        //B--> ++a  EXP=102,a=102

        int B=10;
        System.out.println(++B + ++B);  //23
        System.out.println(B);      //12
        //B--> ++b  EXP=11, b=11
        // +
        //B--> ++b  EXP=12, b=12

        int b=10;
        System.out.println(++b + b++ + b++);    //34
        System.out.println(b);      //13

        //b--> ++b  EXP=11, b=11
        //b--> b++  EXP=11, b=12
        //b--> b++  EXP=12, b=13
    }
}
