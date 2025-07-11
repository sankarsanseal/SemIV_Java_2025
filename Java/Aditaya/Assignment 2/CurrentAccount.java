/* 
Sub class for Current Accounts inheriting data from Parent class Account 
It has attributes to store overdraft limit.
It has a constructor to initialize these values,
and methods to get the values of these attributes.

Author: Aditaya Samui
Date: 23-06-2025
*/

class CurrentAccount extends Account{
    public double overdraft_limit;      //Stores maximum amount you can withdraw beyond your balance

    //Constructor
    CurrentAccount(String account_no, double account_balance, double overdraft_limit) {
        super(account_no, account_balance);
        this.overdraft_limit=overdraft_limit;      
    }
    
    //Methods
    public double getOverdraftLimit() {     
        return overdraft_limit;
    }
    
}
