package ex_10082024_OOPs.encap;

public class Lab_179 {

    //Encapsulation:Data Hiding,security,privacy
    //U can not access any data member without a function. Those functions can only access the data members.
    //getting and setting values can be controlled
    public static void main(String[] args) {
        Login_1 login1= new Login_1("Deepa","deepa123");
        System.out.println(login1.username);        //Deepa
        //System.out.println(login1.password);     //deepa123
        //login1.password="dipa";
        //System.out.println(login1.password);     //dipa

        //Here member is private in nature so no one can access it and can not modify the password.
        //It will throw an error.
        //You can only access username as its public in nature
        System.out.println(login1.getUsername());   //Deepa
        login1.setUsername("dipachavan");
        System.out.println(login1.getUsername());   //dipachavan
        System.out.println(login1.getPassword());   //deepa123
        login1.setPassword("dd123",true);               //this is controlled.if true then Only authenticated person can set password.
        System.out.println(login1.getPassword());   //dd123
    }
}

//getter and setter is wrapping of a data, used to secure data members.
//getter--to fetch the value,secure this as well
//setter--to set/update the value,secure this as well based on the condition
class Login_1
{
    //data members
    public String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAuthen) {
        //Here u can write a code to authentication a user.If user is authenticated then only he will be allowed to set a password.
        if(isAuthen)
        {
            this.password = password;
        }
        else System.out.println("U are not allowed");

    }

    //DC
    Login_1(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
