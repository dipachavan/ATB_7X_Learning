package ex_17082024;

public class Lab_200 {
    public static void main(String[] args) {
        APIAUtomation apiaUtomation=new APIAUtomation();
    }

}

class APIAUtomation{

    static
    {
        System.out.println("load data from MySQL");
    }
    {
        System.out.println("load data from CSV");
    }
}

//output:
/*

load data from MySQL
load data from CSV

 */