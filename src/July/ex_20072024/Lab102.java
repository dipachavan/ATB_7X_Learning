package ex_20072024;

public class Lab102 {
    public static void main(String[] args) {
        int a=11;
        switch (-1){
            default:
                System.out.println("default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
//output is : 10
//-1 will directly get compared to case -1.
