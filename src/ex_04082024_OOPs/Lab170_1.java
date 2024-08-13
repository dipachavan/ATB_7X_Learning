package ex_04082024_OOPs;

import java.util.Scanner;

public class Lab170_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter bank name:");
        String bankName=sc.next();
        System.out.println("Enter bank balance:");
        int balance=sc.nextInt();
        System.out.println("Enter bank code:");
        String bankCode=sc.next();

        BankAccount bankAccount= new BankAccount(bankName,balance,bankCode);
        bankAccount.printBankDetails();
        sc.close();
    }
}
//output is :
/*

Enter bank name:
Jkhh
Enter bank balance:
454
Enter bank code:
jbjb41

In parameterised constructor with all 3:
Bank name:Jkhh
Bank code:jbjb41
Bank balance:454

*/