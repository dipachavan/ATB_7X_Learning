package ex_04082024_OOPs;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;
    //DC
    BankAccount()
    {
        System.out.println("In default constructor:");
        this.bankName="SBI";
        this.balance=100;
        this.bankCode="SBI00001";
    }
    //PC
    public BankAccount(String bankName, int balance, String bankCode)
    {
        System.out.println();
        System.out.println("In parameterised constructor with all 3:");
        this.bankName = bankName;
        this.balance = balance;
        this.bankCode = bankCode;

    }
    //PC
    public BankAccount(String bankName, String bankCode)
    {
        System.out.println();
        System.out.println("In parameterised constructor with bank name and bank code:");
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

    public BankAccount(String bankName)
    {
        System.out.println();
        System.out.println("In parameterised constructor with bank name:");
        this.bankName = bankName;
    }

    void printBankDetails()
    {
        System.out.println("Bank name:"+bankName);
        System.out.println("Bank code:"+bankCode);
        System.out.println("Bank balance:"+balance);
    }
}
