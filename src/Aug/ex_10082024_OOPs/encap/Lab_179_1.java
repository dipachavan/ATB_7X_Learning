package ex_10082024_OOPs.encap;

public class Lab_179_1 {public static void main(String[] args) {
    Login_2 login2= new Login_2("Deepa","deepa123");
    System.out.println(login2.getUsername());       //Deepa

    // here only username can be seen.To achieve more security this can be done.This is hiding from the end users.
}
}

class Login_2
{
    //data members
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }
    //DC
    Login_2(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
