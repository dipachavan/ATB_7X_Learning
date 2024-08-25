package ex_27072024;

public class Lab142 {
    public static void main(String[] args) {
        final int a[]=new int[4];       //here length of an array a is final not those values in that array
        //final does not make any sense as even if u dont write final, length will be fixed.
        a[3]=55;
        System.out.println(a[3]);       //55

        //but if u apply final on a variable/single element then u cant change its value.
        final int b=100;
        //b=101;        //so this is not allowed as its final
    }
}
