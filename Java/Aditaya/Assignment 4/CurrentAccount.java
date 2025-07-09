/* Sub class for Current Accounts inheriting data from Parent class Account */

import java.time.LocalDate;

class CurrentAccount extends Account{
    public double overdraft_limit;      //Stores maximum amount you can withdraw beyond your balance
    public LocalDate last_overdrawn_date;

    //Constructor
    CurrentAccount(String account_no, double account_balance, double overdraft_limit) {
        super(account_no, account_balance, LocalDate.now());
        this.overdraft_limit=overdraft_limit;
        last_overdrawn_date=null;       
    }
    
    //Methods
    public double getOverdraftLimit() {
        return overdraft_limit;
    }
    
    public double getOverdrawnAmount() {
        return 0.0;           //?????????????????????????????????
    }
}
