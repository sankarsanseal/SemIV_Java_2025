/* Parent Class Account to store Account Number and Account Balance */

import java.time.LocalDate;

class Account {
    public String account_no;           //Stores Account number
    public double account_balance;      //Stores current balance in the account
    public LocalDate account_open_date; //Stores the Date on which account was opened

    //Constructor
    Account(String account_no, double account_balance, LocalDate account_open_date) {
        this.account_no=account_no;
        this.account_balance=account_balance;
        this.account_open_date=account_open_date;
    }

    //Methods
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
