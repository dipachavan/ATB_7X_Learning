package ex_21072024;

public class Lab120 {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if(i == 5){
                break;          // it will break this for loop
            }
            else System.out.println(i);
        }
        // out put is as below:
        /*
        1
        2
        3
        4
        * */
        for (int i=1;i<=10;i++){
            System.out.println(i);
            if(i == 5) {
                break;          // it will break this for loop and before that it will print value of i, i.e. 5
            }
        //Output is as below:
        /*
        1
        2
        3
        4
        5
        * */
        }
    }
}
