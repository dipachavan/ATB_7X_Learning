package ex_17082024.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_217 {
    public static void main(String[] args) {
        try {
            FileReader fileReader=new FileReader("c://deepa.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

/*

Exception in thread "main" java.lang.RuntimeException: java.io.FileNotFoundException: c:\deepa.txt (The system cannot find the file specified)
	at ex_17082024.exceptions.Lab_217.main(Lab_217.java:11)
Caused by: java.io.FileNotFoundException: c:\deepa.txt (The system cannot find the file specified)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:106)
	at java.base/java.io.FileReader.<init>(FileReader.java:60)
	at ex_17082024.exceptions.Lab_217.main(Lab_217.java:9)

 */