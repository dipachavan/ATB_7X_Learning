package ex_27072024;

public class Lab145 {
    public static void main(String[] args)
    {
        System.out.println(args[0]);        // you will get ArrayIndexOutOfBoundsException becuase there is no value set in args
        // to add arguments you need to click on 3 dots on console then click on modify run configurations and aa your arguments.
        //SO I have added as Deepa Vilas Chavan
        System.out.println(args[1]);    //Vilas
        System.out.println(args[0]);    //Deepa
        System.out.println(args[2]);    //Chavan
        System.out.println(args.length);    //3

        System.out.println("***********************");
        // to check if u have set the arguments and avoid the exception.
        if(args.length>0){
            for (int i=0;i< args.length;i++){
                System.out.println(args[i]);        //Output will be Deepa Vilas Chavan     ---> in next lines
            }
        }
        else
        {
            System.out.println("No inputs given");
        }
    }
}

