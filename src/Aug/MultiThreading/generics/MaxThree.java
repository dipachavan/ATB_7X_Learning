package Aug.MultiThreading.generics;

public class MaxThree {
    public static void main(String[] args) {
        System.out.println(maximumOf(1,12,0));
        System.out.println(maximumOf(true,false,true));
        System.out.println(maximumOf("Deepa","dipa","Dipa"));
        System.out.println(maximumOf('R','D','E'));
    }

    public static <DT extends Comparable<DT>> DT maximumOf(DT a,DT b,DT c)
    {
        //DT is custom class created
        DT max=a;
        if(b.compareTo(max) > 0){           //to compare string we need Comparable
            max=b;
        }
        if(c.compareTo(max) > 0){           //Strings can be only compared with Comparable
            max=c;
        }
        return max;
    }
}

//This way a generic method is created which can take any type of datatype values.No need to create separate methods for each data type
//Generics will be used in API automation where we are not sure the data type of the response.

//public static <DT extends Comparable<DT>> DT maximumOf(DT a,DT b,DT c)
//here DT(1st) is class who is extending Comparable
//<DT> data type(2nd)
//DT is a return type(3rd)