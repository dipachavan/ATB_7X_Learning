package ex_11082024.Interface;

public class Lab_191 {
    public static void main(String[] args) {

    }
}

interface I1{ }
interface I2{ }
class A{}
class B{}
abstract class C{}
class Test1 extends A{}
class Test2 extends C{}
//class Test3 extends A,B{}         //class can not extend multiple classes
class Test4 implements I1{}
class Test5 implements I1,I2{}
class Test6 extends A implements I1{}
//class Test implements I1 extends A{}      //invalid
//interface I3 extends A{}
interface I4 extends I1,I2{}
//interface I5 implements I1{}      //no implement clause allowed for interface