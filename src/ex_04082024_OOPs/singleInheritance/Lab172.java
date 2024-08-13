package ex_04082024_OOPs.singleInheritance;

public class Lab172 {
    public static void main(String[] args) {
        Child child= new Child();
        child.room();
        //child.house();        //this is invalid as there is no relation between parent and child until you extends from parent to child.
        child.house();          //Once there is relation between parent and child, child can access parent.

        //Here parent can not access child because when parent was created, there was no child created.
        Parent parent= new Parent();
        //parent.room();        // invalid
        parent.house();
    }
}
