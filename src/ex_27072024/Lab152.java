package ex_27072024;

public class Lab152 {

    public static void main(String[] args) {

        String s1="Dipa";
        s1="Chavan";
        // 2 strings are created here.

        //String Buffer and Builder

        StringBuffer stringBuffer= new StringBuffer("Deepa");
        stringBuffer.append("Chavan");              // new string will be created with Deepa Chavan
        System.out.println(stringBuffer);

        StringBuilder stringBuilder= new StringBuilder("Vilas");
        stringBuilder.append("Chavan");             // new string will be created with Vilas Chavan
        System.out.println(stringBuilder);

        //Difference between 2 is thread safety
    }
}
