package ex_20072024;

public class Lab100 {
    public static void main(String[] args) {
        //JDK>13
        //Switch can return something
        char code='A';
        int val=switch(code) {
            case 'A':
                yield 65;       //yield is return.But return is not supported instead of yield.Don't have to use break

            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }
}
/*
output is : if Z
Exception in thread "main" java.lang.IllegalStateException: Unexpected value: Z
at ex_20072024.Lab100.main(Lab100.java:13)

output is : if A
65
 */