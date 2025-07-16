/* 
 Main driver class to test different types of bank accounts.
 It creates instances of SavingAccount, CurrentAccount, and FixedDepositAccount,
 performs operations like adding interest, and prints relevant outputs
 to demonstrate the working of each class.

 Author: Aheli Manna
 Date: 11-07-2025
*/

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Testing SavingAccount
        SavingAccount s = new SavingAccount("S101", -10000, 5.0f);
        s.addInterest();
        System.out.println("Saving Acc Balance: " + s.getAccountBalance());
        System.out.println("Interest Paid: " + s.getInterestPaid());

        // Testing CurrentAccount
        CurrentAccount c = new CurrentAccount("C202", 5000, 2000);
        System.out.println("Overdraft Limit: " + c.getOverdraftLimit());

        // Testing FixedDepositAccount
        FixedDepositAccount f = new FixedDepositAccount("F303", 20000, 6.5f, 365, new Date(), 1);
        f.addInterest();
        System.out.println("FD Interest Paid: " + f.getInterestPaid());
        System.out.println("Maturity Amount: " + f.getMaturityAmount());
    }
}