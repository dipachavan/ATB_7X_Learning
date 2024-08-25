package ex_14072024;

public class Lab011 {
    public static void main(String[] args) {
        String s1=new String("Deepa");
        String s2=new String("Deepa");
        String s3=new String("Deepa");

        //3 strings will be created due to new operator and new always creates new memory
        System.out.println(s1==s2);     //false
        System.out.println(s2==s3);     //false
        //even if they are stored in Heap memory only, but location is different in heap area.== checks for reference/location.
        System.out.println(s2.equals(s3));      //true  //checks for content

        String name="DeEpa";
        //String name="D  e E p a";
        //             |0|1|2|3|4|
        char c=name.charAt(2);
        System.out.println(c);     //E
        name.concat("Chavan");
        System.out.println(name);       //DeEpa //It will concat but it will not store it in anywhere(pointing to DeEpa only) due to immutable nature of strings
        name=name.concat("Chavan");     //after this only name is pointed to DeEpa Chavan
        System.out.println(name);
    }
}
