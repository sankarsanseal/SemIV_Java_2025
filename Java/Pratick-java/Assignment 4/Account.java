/* 
 Base class for different types of bank accounts such as Saving, Current, and Fixed Deposit.
 It contains attributes to store account number, balance, and opening date.
 It provides a constructor to initialize these values,
 and getter methods to access the account details.

 Author: Pratick Dam
 Date: 10-07-2025
*/

import java.time.LocalDate;

// Base class for all types of accounts
public class Account {
    private String account_no;
    private double account_balance;
    private LocalDate account_open_date;

    // Constructor to initialize account details
    public Account(String account_no, double account_balance, LocalDate account_open_date) {
        this.account_no = account_no;
        this.account_balance = account_balance;
        this.account_open_date = account_open_date;
    }

    public String getAccountNo() {
        return account_no;
    }

    public double getAccountBalance() {
        return account_balance;
    }

    public LocalDate getAccountOpenDate() {
        return account_open_date;
    }
}
