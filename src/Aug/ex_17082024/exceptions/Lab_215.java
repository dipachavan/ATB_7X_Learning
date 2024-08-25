package ex_17082024.exceptions;

public class Lab_215 {
    public static void main(String[] args) {
        final float pi=3.14f;
        int a=0;
        try
        {
            int b=10/a;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("will be executed always");
        }

    }
}

//put only that part in try catch block which is vulnerable