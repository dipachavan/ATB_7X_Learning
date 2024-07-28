package ex_20072024;

public class Lab097 {
    public static void main(String[] args) {
        //jdk above 13
        int itemcode=005;
        switch (itemcode){
            case 001,002,003:       // we can give multiple conditions in same case
                System.out.println("Electronic");
                break;
            case 004,005,006:
                System.out.println("Mechanical");
                break;
            default:
                System.out.println("no idea");
        }
        //out put is Mechanical

    }
}
