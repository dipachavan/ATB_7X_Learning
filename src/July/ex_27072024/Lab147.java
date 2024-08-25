package ex_27072024;

import java.util.Arrays;

public class Lab147 {
    public static void main(String[] args) {
        //find out maximum number
        int arr[]={55,89,100,77,65,10,99,45};
        int max=1;
        int min=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println(max);        //100
        System.out.println(min);        //10

        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);      //100    // -1 because we have sorted it so max number will be at the end of that array
    }

}
