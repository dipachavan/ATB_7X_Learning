package ex_10082024_OOPs.encap;

public class BankAccount {
    private String bankName;
    private int bankBalance;

    public BankAccount(String bankName, int bankBalance)
    {
        this.bankName = bankName;
        this.bankBalance = bankBalance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName,boolean isAuth) {
        if(isAuth)
        {
            this.bankName = bankName;
            System.out.println("allowed");
        }
        else System.out.println("Not allowed");

    }

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance,boolean isAuth) {
        if(isAuth)
        {
            this.bankBalance = bankBalance;
            System.out.println("allowed");
        }
        else System.out.println("Not allowed");

    }
}
