package ex_21072024;

public class Lab122 {
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            System.out.println(i);
            if(i == 5){
                  continue;         // if condition is true then go back and dont execute the next line code.
            }
            System.out.println("After");

        }

        }
    }

    //Output:
/*
1
After
2
After
3
After
4
After
5
6
After
7
After
8
After
9
After

    */
