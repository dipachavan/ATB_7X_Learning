package ex_10082024_OOPs.encap;

public class Lab_178
{
    public static void main(String[] args) {
        Login login= new Login("Deepa","deepa123");
        System.out.println(login.password);     //deepa123
        login.password="dipa";
        System.out.println(login.password);     //dipa

        //Here members are public in nature so any one can access it and can modify the password.
        //But if members are private in nature then its access is restricted.
    }
}

class Login
{
    public String username;
    public String password;
    //DC
    Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
}