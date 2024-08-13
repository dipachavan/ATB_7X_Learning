package ex_04082024_OOPs;

public class Lab165 {

    int age=30;     //instance variable
    void f1(){
        int age2=33;        //local variable to function f1.SO we can not access it in function f2().
        //life os age2 is within this function f1() only.
        System.out.println(age);
    }

    //life of age is within this class.

//    void f2(){
//
//        System.out.println(age2);   //local variable to function f1.SO we can not access it in function f2().
//    }
}
