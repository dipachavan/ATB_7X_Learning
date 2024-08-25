package ex_10082024_OOPs.encap;

public class Lab_180 {

    //Encapsulation is hiding the data members using getters and setters.
    public static void main(String[] args) {
        BankAccount bankAccount1= new BankAccount("bankAccountant",50000);

        bankAccount1.setBankBalance(10000,false);
        System.out.println(bankAccount1.getBankBalance());

        BankAccount admin= new BankAccount("admin",100000);
        admin.setBankName("HDFC",true);
        System.out.println(admin.getBankName());
        admin.setBankBalance(520000,true);
        System.out.println(admin.getBankBalance());
    }
}

//output is :
/*

Not allowed
50000
allowed
HDFC
allowed
520000

*/