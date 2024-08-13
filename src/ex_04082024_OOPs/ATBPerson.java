package ex_04082024_OOPs;

public class ATBPerson {
    String name;
    int rollNo;
    //DC
    ATBPerson()
    {
        System.out.println(" Object created through Default constructor.......");
    }

    //Parameterized constructor
    public ATBPerson(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        // this means current class
        // here right side variables are the params
        // left side variable are the instance variables
    }

    public ATBPerson(String name) {
        this.name = name;
    }
//Parameterized constructor
//    public ATBPerson(String givenName, int givenRollNo) {
//        this.name = givenName;
//        this.rollNo = givenRollNo;
//
//        // here right side variables are the params
//        // left side variable are the instance variables
//    }


}
