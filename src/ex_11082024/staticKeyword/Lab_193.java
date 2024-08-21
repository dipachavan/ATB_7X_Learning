package ex_11082024.staticKeyword;

public class Lab_193 {
    public static void main(String[] args) {
        ATB atb= new ATB("Deepa");
        System.out.println(atb.getName());
        System.out.println(ATB.courseName);
        ATB.doAssignment();

        ATB atb2=new ATB("Dipa");
        System.out.println(atb2.getName());
        System.out.println(ATB.courseName);
        ATB.doAssignment();
    }

}

class ATB
{
    private String name;
    static String courseName="Java";

    {
        System.out.println("this is block,whenever object is initialized, it will be executed");
    }
    static
    {
        System.out.println("this is a static block,will be called automatically when class is loaded,no need to call");
    }
    ATB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static void doAssignment(){
        System.out.println("do assignment");
    }

    static class B
    {

    }
}


//output:
/*

this is a static block,will be called automatically when class is loaded,no need to call
this is block,whenever object is initialized, it will be executed
Deepa
Java
do assignment
this is block,whenever object is initialized, it will be executed
Dipa
Java
do assignment


*/