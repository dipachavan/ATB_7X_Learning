package ex_18082024.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_219_throws {
    public static void main(String[] args) throws FileNotFoundException {

            String path="c://deepa.txt";
            File file= new File(path);
            FileReader fileReader= new FileReader(file);        // this is checked exception. either we can handle this with try catch or with throws keyword.

    }
}
