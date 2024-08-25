package ex_04082024_OOPs;

public class Lab170 {
    public static void main(String[] args) {
        BankAccount ba1= new BankAccount();
        ba1.printBankDetails();

        BankAccount ba2=new BankAccount("IndusInd",1000,"IND101");
        ba2.printBankDetails();

        BankAccount ba3= new BankAccount("BOB","BOB0002");
        ba3.printBankDetails();

        BankAccount ba4= new BankAccount("BOM");
        ba4.printBankDetails();
    }
}
// Output is:
/*

In default constructor:
Bank name:SBI
Bank code:SBI00001
Bank balance:100

In parameterised constructor with all 3:
Bank name:IndusInd
Bank code:IND101
Bank balance:1000

In parameterised constructor with bank name and bank code:
Bank name:BOB
Bank code:BOB0002
Bank balance:0

In parameterised constructor with bank name:
Bank name:BOM
Bank code:null
Bank balance:0

*/