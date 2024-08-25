package ex_18082024.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_221 {
    public static void main(String[] args) throws FileNotFoundException{


        try {
            int c=10/0;         //unchecked//arithmetic divide by zero
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e2){
            System.out.println(e2);

        }
        //String path_0="c://deepa.txt";
        String path="C://Users//deepa//OneDrive//Test.txt";         //checked
        File file= new File(path);
        //FileReader fileReader= new FileReader(path_0);// this is checked exception. either we can handle this with try catch or with throws keyword.
        FileReader fileReader= new FileReader(file);// this is checked exception. either we can handle this with try catch or with throws keyword.


    }

    }




