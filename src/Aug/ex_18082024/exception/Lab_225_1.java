package ex_18082024.exception;

public class Lab_225_1 {
    public static void main(String[] args) {
        String s=null;
        try {
            if(s==null){
                //throw new NullPointerException("enter non null string");
            }
            s.trim();                   //will throw nullpointerexception
        } catch (Exception e) {
            System.out.println(e.getMessage());             //Cannot invoke "String.trim()" because "s" is null
        }
    }
}

//user can handle by try catch or throws or throw
/*
if user does not throw the exception, JVM will throw below exception

Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.trim()" because "s" is null
	at ex_18082024.exception.Lab_225.main(Lab_225.java:9)



*/


//output
//Cannot invoke "String.trim()" because "s" is null