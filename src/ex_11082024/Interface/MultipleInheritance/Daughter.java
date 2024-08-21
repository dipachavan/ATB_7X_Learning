package ex_11082024.Interface.MultipleInheritance;

public class Daughter implements Father,Mother{
    @Override
    public void money() {
        System.out.println("no parameters");
    }

    @Override
    public void home(String room, int floor) {
        System.out.println("room and floor parameters");
    }

    @Override
    public void money(int amt) {
        System.out.println("amt parameter");
    }
}
