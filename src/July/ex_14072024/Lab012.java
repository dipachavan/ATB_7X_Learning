package ex_14072024;

public class Lab012 {
    public static void main(String[] args) {
        String password="DeEpa@123";
        String pass=password.toLowerCase();
        System.out.println(pass == password);   //false //references are different as password.toLowerCase() will create new string at diff location
        System.out.println(pass.equals(password));  //false
        System.out.println(pass.equalsIgnoreCase(password));    //true

        System.out.println(password.substring(0,2));    //De
        System.out.println(password.indexOf('E'));      //2
        System.out.println(password.length());      //9
    }
}
