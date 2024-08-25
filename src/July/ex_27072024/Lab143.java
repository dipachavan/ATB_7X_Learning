package ex_27072024;

public class Lab143 {
    public static void main(String[] args) {
        //disadvantages of array
        //1.length is fixed
        //2.only same type of data we can add
        //3.wastage of memory

        int arr[]=new int[5];
        arr[0]=10;      //
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);             //output is 10 0 0 0 0 Here only arr[0] has value in it,rest of the location are wasted.
        }

    }
}
