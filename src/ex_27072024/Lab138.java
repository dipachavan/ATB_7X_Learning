package ex_27072024;

public class Lab138 {
    public static void main(String[] args) {

        int[] marks={100,98,97,87,99,74};                       //initializing an array,fixed length
        System.out.println(marks.length);//6
        System.out.println(marks[0]);   //100
        System.out.println(marks[1]);   //98
        System.out.println(marks[2]);   //97
        System.out.println(marks[3]);   //87
        System.out.println(marks[4]);   //99
        System.out.println(marks[-1]);   //ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6
        System.out.println(marks[7]);   //ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 6
    }
}

