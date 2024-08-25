package ex_20072024;

public class Lab091 {
    public static void main(String[] args)
    {
    if(true){                       //if will be always true
        System.out.println("1");
            if(true){               //if will be always true
                System.out.println("2");
                    if (true)       //if will be always true
                    {
                        System.out.println("3");
                    }
            }
        }
        /*
        Output is:
        1
        2
        3
        */
        System.out.println("*********************");
        if(true){                       //if will be always true
            System.out.println("1");
            if(false){               //if will be always false
                System.out.println("2");
                if (true)       //if will be always true
                {
                    System.out.println("3");
                }
            }
        }
        /*
        Output is:
        1
        */
        System.out.println("*********************");
        if(false){                       //if will be always true
            System.out.println("1");
            if(false){               //if will be always false
                System.out.println("2");
                if (true)       //if will be always true
                {
                    System.out.println("3");
                }
            }
        }
        /*
        Output is:null(nothing will be printed on console)

        */
    }
}

