package ex_17082024;

public class Lab_205 {
    public static void main(String[] args) {
        System.out.println("Bug value is : "+Bug.CRITICAL);
        System.out.println("Bug value is : "+Bug.HIGH);
        System.out.println("Bug value is : "+Bug.MEDIUM);
        System.out.println("Bug value is : "+Bug.LOW);
        System.out.println("Color value is : "+Colours.GREEN.getColorValue());
        System.out.println("Color value is : "+Colours.RED);
        System.out.println("Color value is : "+Colours.PINK.getColorValue());
        System.out.println("Color value is : "+Colours.BLUE);


    }
}


//out put is:
/*

Bug value is : CRITICAL
Bug value is : HIGH
Bug value is : MEDIUM
Bug value is : LOW
Color value is : ###1300
Color value is : RED
Color value is : ###1100
Color value is : BLUE

 */