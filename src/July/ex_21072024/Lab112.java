package ex_21072024;

public class Lab112 {
    public static void main(String[] args) {
        final boolean b=true;
        //b=false  This can not be done as b is final
//        for (int i=0;b;i++){
//            System.out.println("Helloooo");          // infinite loop as condition will be always true.
//        }

//        for (int i=0;;){
//            System.out.println("Helloooo");          // infinite loop as no condition and no updation.
//        }
//
//       for (;;){
//            System.out.println("Helloooo");          // infinite loop as no initialization, condition and no updation.
//        }
        for(float f=0;f<10.33;f++){
            System.out.println("hello with float-->"+f);       //float is supported in for loop
        }

        for(byte f=0;f<10.33;f++){
            System.out.println("hello with byte-->"+f);       //byte is supported in for loop
        }
    }
}

/*
Out put will like below for float:
hello with float-->0.0
hello with float-->1.0
hello with float-->2.0
hello with float-->3.0
hello with float-->4.0
hello with float-->5.0
hello with float-->6.0
hello with float-->7.0
hello with float-->8.0
hello with float-->9.0
hello with float-->10.0
hello with byte-->0
hello with byte-->1
hello with byte-->2
hello with byte-->3
hello with byte-->4
hello with byte-->5
hello with byte-->6
hello with byte-->7
hello with byte-->8
hello with byte-->9
hello with byte-->10

*/