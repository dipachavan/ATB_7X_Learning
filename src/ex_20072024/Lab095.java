package ex_20072024;

public class Lab095 {
    public static void main(String[] args) {
    int a=1;
    switch (a)
    {
        //no output int is allowed for switching
    }

    char ch ='A';
    switch (ch)
    {
        //no output char is allowed for switching, as char is an int internally,it's represented by ASCII values
    }

    /*boolean b =true;
        switch (b)
        {
            //boolena is not supported for switching.
            //we need expression and boolean is a condition
    }*/

   long l1=212l;
   switch ((int)l1)
   {
       //no output long is allowed for switching
   }

    }
}
