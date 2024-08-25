package ex_14072024;

public class Lab004 {
    public static void main(String[] args) {
        //casting
        byte a=10;
        int b=a;
        System.out.println(b);  //10  internally its type cast into integer.Its called as implicit casting.JVM does this automatically.
        // int b=(int) a.  Its called as explicit casting.
        //TYPE CASTING
            // Source type is not same as destination type.Then source type must be converted into destination type.
        //1.widening->smaller to bigger.Safe conversion.Above process is called as widening.
        //2.narrowing-> bigger to smaller.This process is called as narrowing.It is not safe,data is lost in this process.
        int c=300;
        //byte d=c;     //This is invalid but still you want to do it, we have to type cast it explicitly.
        byte d=(byte) c;    //This is explicitly done and called as narrowing.Whatever it can store, those will be stored and rest will be flown/lost.
        System.out.println(d);  //44  binary conversion is done so 44. Only 8 bits stored,hence 44.

        int price=100;
        float gst=18.45f;
        //int actualPrice=price+gst;    //This is implicit narrowing but this is not allowed by JVM.
        //in above statement
        int actualPrice=price+(int)gst;     //This is explicit narrowing.
        System.out.println(actualPrice);    //Out put is 118. So here 0.45 is lost.
        //instead of above statement, we can type cast it into float as below.
        float coursePrice=price+gst;
        System.out.println(coursePrice);    //118.45

    }
}
