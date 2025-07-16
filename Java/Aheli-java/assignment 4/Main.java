/* 
Represents the main program to test the SavingAccount class functionality.
This class demonstrates creating a SavingAccount object, adding interest, and displaying account details.
It uses the SavingAccount class to simulate basic account operations such as adding interest.

Author: Aheli Manna
Date: 11-07-2025
*/
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Create a SavingAccount
        SavingAccount savings = new SavingAccount(
                "SAV123",           // Account No
                10000.0,            // Balance
                LocalDate.of(2023, 1, 1),  // Open Date
                5.0f,               // Interest Rate
                LocalDate.of(2023, 12, 1) // Last interest paid date
        );

        savings.addInterest(); // Add interest to savings account
        System.out.println("----- Saving Account -----");
        System.out.println("Account No: " + savings.getAccountNo());
        System.out.println("Balance: ₹" + savings.getAccountBalance());
        System.out.println("Interest Paid: ₹" + savings.getInterestPaid());
    }
}
