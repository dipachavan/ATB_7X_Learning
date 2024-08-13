package ex_04082024_OOPs.multiLevelInheritance;

public class Lab174 {
    public static void main(String[] args) {
        Child child= new Child();
        child.home();           // priority is to local, its own home().
        // If its not available then it will check for parent,t=if not there then check in grandparent.
        //This is called as multi level.

    }
}
