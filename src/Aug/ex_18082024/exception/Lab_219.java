package ex_18082024.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_219 {
    public static void main(String[] args) throws FileNotFoundException,NullPointerException,ArithmeticException{

        extracted();

    }

    public static void extracted() throws FileNotFoundException,NullPointerException,ArithmeticException{
        //String path_0="c://deepa.txt";
        String path="C://Users//deepa//OneDrive//Test.txt";
        File file= new File(path);
        //FileReader fileReader= new FileReader(path_0);// this is checked exception. either we can handle this with try catch or with throws keyword.
        FileReader fileReader= new FileReader(file);// this is checked exception. either we can handle this with try catch or with throws keyword.
        int c=10/0;     //arithmetic divide by zero

    }
}


//output:
//if not thrown in main()
/*

    java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown

*/

