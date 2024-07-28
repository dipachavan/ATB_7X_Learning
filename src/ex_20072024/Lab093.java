package ex_20072024;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        //which browser u want to use?
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter browser name that u want to start");
        String browser=sc.next();
        browser=browser.toLowerCase();
        switch (browser){
            case "chrome":
                System.out.println("Start with chrome browser");
                break;
            case "firefox":
                System.out.println("Start with firefox browser");
                break;
            case "edge":
                System.out.println("Start with edge browser");
                break;
            default:
                System.out.println("No idea,this browser does not exist");
        }
    }
}
