/* 
Parent Class Account to store Account Number and Account Balance.
having a constructor to initialize these values,
and methods to get the values of these attributes.

Author: Aheli Manna
Date: 11-07-2025
*/

// Superclass for all account types
public class Account {
    private String account_no;          // Account number
    private double account_balance;     // Current balance

    // Constructor to initialize account
    public Account(String account_no, double account_balance) {
        this.account_no = account_no;
        this.account_balance = account_balance;
    }

    public String getAccountNo() {
        return account_no;
    }

    public double getAccountBalance() {
        return account_balance;
    }
}