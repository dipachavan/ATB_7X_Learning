package ex_21072024;

public class Lab135 {
    public static void main(String[] args) {
        // 2 components of the function
            //1.define
            //2.calling that function.
        //JVM recognises the functions,JVM calls the functions
        //function within function is not allowed

        //function calling
        for(int i=0;i<4;i++){
            greet();                //4 times Hello Deepa
        }

    }
    // defining the function
    //void means no return
    static void greet()
    {
        System.out.println("Hello Deepa");
    }
}
