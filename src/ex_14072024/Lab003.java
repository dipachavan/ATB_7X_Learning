package ex_14072024;

public class Lab003 {
    public static void main(String[] args) {
        byte a=20;
        byte b=40;
        //byte c=a+b;
        int c=a+b;
        //Above statement will show a syntax error because byte + byte should be an int. This is the RULE.
        //This rule is there because there may be a case where limit of byte (128) mya exceed.So,to avoid this situation,this rule is made.
        //So, when 2 byte operands are operating,result should be stored in int data type(bigger container).
        //Same rule is applied to short+char,char+char,char+int,short+byte
        //Basically the bigger container
        System.out.println(c);   //60

        char a1='A';  //ASCII value =65   You can declare like char a1='65'
        char b1='B';  //ASCII value =66
        //char c=a1+b1;   same rule as above
        //characters are internally integers only.
        int c1=a1+b1;   //131
        System.out.println(c1);   //131
    }
}
