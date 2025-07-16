/* 
Parent Class Account to store Account Number and Account Balance
having a constructor to initialize these values,
and methods to get the values of these attributes.

Author: Aditaya Samui
Date: 23-06-2025
*/

class Account {
    public String account_no;           //Stores Account number
    public double account_balance;      //Stores current balance in the account

    //Constructor
    Account(String account_no, double account_balance) {
        this.account_no=account_no;
        this.account_balance=account_balance;
    }

    //Methods
    public String getAccountNo() {
        return account_no;
    }

    public double getAccountBalance() {
        return account_balance;
    }

}
