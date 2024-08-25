package ex_04082024_OOPs;

public class Lab165_1 {

    int age=30;     //instance variable
    void f1(){
        int age=33;
        System.out.println(age);    //age =33 will be used here. as preference will be for local variable.
    }

    //life of age is within this class.
    
    void f2(){

        System.out.println(age);   //instance variable will be used here.
    }
}

//NO GLOBAL Var in java