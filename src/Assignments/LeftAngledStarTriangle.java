package Assignments;

public class LeftAngledStarTriangle {
    public static void main(String[] args) {

        for(int i =5; i>0; i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //using array
        int[][] left_traingle_pattern= new int[5][5];

        for (int i = 0; left_traingle_pattern.length > i; i++)
        {
            for (int j = 0; left_traingle_pattern.length > j ; j++) {
                if (j >= i) {
                    System.out.print('*');

                }
            }
            System.out.println();

        }

            }



}


/*

 *****
 ****
 ***
 **
 *

*/
