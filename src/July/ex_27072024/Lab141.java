package ex_27072024;

public class Lab141 {
    public static void main(String[] args) {
        int a[]=new int[4];
        a[3]=55;
        System.out.println(a[2]);       //0
        System.out.println(a[1]);       //0
        System.out.println(a[0]);       //0
        System.out.println(a[3]);       //55
        System.out.println(a[4]);       // exception. array index out of bounds exception
    }
}
