package ex_14072024;

public class Lab010 {
    public static void main(String[] args) {
        String s1="Deepa Vilas Chavan";
        String s2="Deepa Vilas Chavan";
        // here only 1 string will be there in SCP as content is same.
        //When content is same,reference will be same.Meaning s1 and s2 pointing to same content in SCP.

        System.out.println(s1==s2);     //true  //check for reference
        System.out.println(s1.equals(s2));  //true  //check for content
        System.out.println("*******************");
        String s3=new String("Deepa Vilas Chavan");
        String s4=new String("Deepa Vilas Chavan");
        // Here these 2 are different strings stored in HEAP

        //So, 3 strings in total.
        System.out.println(s1==s3);     //false //CHeck for ref //location is different
        System.out.println(s1.equals(s3));      //true //checks content


    }
}
