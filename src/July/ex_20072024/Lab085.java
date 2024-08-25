package ex_20072024;

public class Lab085 {
    public static void main(String[] args) {
        boolean a=true;
        a=!a;
        if(2+2 >= 4 )
        {
            System.out.println("inside if block");          //this code is within the loop,line 7 to 10
        }
        System.out.println("Outside of the if condition and value of a is"+" "+ a); //this belongs to main method and hence will always execute.It has nothing to do with if block here.
        //debugging-> checking the code line by line
        //to debug-> mouse hover on the line and click.Where ever you find a condition put debugging there
        System.out.println("******************************************");
        if(2+2 < 4 )
        {
            System.out.println("inside if block");          //this code is within the loop,line 7 to 10
        }
        System.out.println("Outside of the if condition and value of a is"+" "+ a);

        /*

        output is as below:
        inside if block
        Outside of the if condition and value of a is false
        ******************************************************
        Outside of the if condition and value of a is false

        */
    }
}
