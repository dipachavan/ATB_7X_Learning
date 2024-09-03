package Aug.poly.methodOverrriding;

public class Sheru extends Dog{
    @Override
    void bark() {
        System.out.println("Sheru is barking");
    }

    void greet(){
        System.out.println("Sheru is greeting");
    }
}


/*When extended parent will be automatically inherited into child but child wants to create his own method with same the same name then JVM will be confused which method to call.
So, to avoid this situation @Override annotation is used.It means that same name method is also there in parent.  */