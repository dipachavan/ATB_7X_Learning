package ex_04082024_OOPs;

public class Lab169 {

    public static void main(String[] args) {
        ATBPerson atbPerson0= new ATBPerson();
        ATBPerson atbPerson1=new ATBPerson("Deepa",101);
        ATBPerson atbPerson2=new ATBPerson("Dipa",102);
        ATBPerson atbPerson3=new ATBPerson("DipaChavan");

        System.out.println(atbPerson0.name);                            //null
        System.out.println(atbPerson1.name+" "+atbPerson1.rollNo);      //Deepa 101
        System.out.println(atbPerson2.name+" "+atbPerson2.rollNo);      //Dipa 102
        System.out.println(atbPerson3.name+" "+atbPerson3.rollNo);      //DipaChavan 0

    }

}
