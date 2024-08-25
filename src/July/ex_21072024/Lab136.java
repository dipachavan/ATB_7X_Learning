package ex_21072024;

public class Lab136 {
    public static void main(String[] args) {
        //Types of functions
        //1. With params and return type
        //2. With params and without return type
        //3. Without params and with return type
        //4. Without params and without return type

        int sum=function1(1,2);
        System.out.println(sum);
        function2(4);
        function3();
        function4();
    }

    //type 1
    static int function1(int a,int b){
        int c= a+b;
        System.out.println("type 1");
        return c;
    }
    //type 2
    static void function2(int a){
        System.out.println("type 2");
    }
    //type 3
    static String function3(){
        System.out.println("type 3");
        return "Deepa";
    }
    //type 4
    static void function4(){
        System.out.println("type 4");
        System.out.println();;
    }

}
