package ex_20072024;

public class Lab086 {
    public static void main(String[] args) {
        //Modulus %  -->it will give you remainder(baaki)
        // 10%2 --> 0
        // 11%2 --> 1

        //Divide / -->it will give you quotient(bhagakar)
        // 10/2 --> 5
        // 11/2 --> 5.5

        int num=11;
        if(num%2==0){
            System.out.println("It is an even number");
        }
        else {
            System.out.println("11 an odd number");
        }
        System.out.println("*****************************************");
        int num2 =10;
        if(num2 %2==0){
            System.out.println("10 an even number");
        }
        else {
            System.out.println("Its an odd number");
        }

        /*

        output is as below:
        11 an odd number
        *****************************************
        10 an even number

        */
    }
}
