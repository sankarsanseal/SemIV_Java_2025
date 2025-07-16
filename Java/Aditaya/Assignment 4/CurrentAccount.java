/* 
Sub class for Current Accounts inheriting data from Parent class Account 
It has attributes to store overdraft limit, last overdrawn date.
It has a constructor to initialize these values,
and methods to get the values of these attributes.

Author: Aditaya Samui
Date: 08-07-2025
*/

import java.time.LocalDate;

class CurrentAccount extends Account{
    public double overdraft_limit;      //Stores maximum amount you can withdraw beyond your balance
    public LocalDate last_overdrawn_date;

    //Constructor
    CurrentAccount(String account_no, double account_balance, LocalDate account_open_date, double overdraft_limit) {
        super(account_no, account_balance, account_open_date);
        this.overdraft_limit=overdraft_limit;
        last_overdrawn_date=null;         
    }
    
    //Methods

    public void withdraw(double amount) {       //method to withdraw amount from the account
        if (amount > getAccountBalance() + overdraft_limit) {
            System.out.println("Withdrawal exceeds overdraft limit.");
        } 
        
        else {
            account_balance -= amount;
            if (account_balance < 0) {
                last_overdrawn_date = LocalDate.now(); // Set the date when the account goes overdrawn
            }
        }
    }

    public double getOverdraftLimit() {
        return overdraft_limit;
    }
    
    public double getOverdrawnAmount() {    
        if(account_balance < 0) {
            return -(account_balance);      //returns the absolute value of negative balance
        }
        return 0.0;
    }
}
