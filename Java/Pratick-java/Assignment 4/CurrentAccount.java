/* 
 Represents a Current Account inheriting from the Account class.
 This class includes additional attributes to handle overdraft limit and the last overdrawn date.
 It provides methods to retrieve the overdraft limit and the overdrawn amount (if applicable).

 Author: Pratick Dam
 Date: 10-07-2025
*/

import java.time.LocalDate;

// Represents a current account with overdraft limit
public class CurrentAccount extends Account {
    private double overdraft_limit;
    private LocalDate last_overdrawn_date;

    // Constructor to initialize current account
    public CurrentAccount(String accNo, double balance, LocalDate openDate, double overdraft_limit, LocalDate lastOverdrawn) {
        super(accNo, balance, openDate);
        this.overdraft_limit = overdraft_limit;
        this.last_overdrawn_date = lastOverdrawn;
    }

    public double getOverdraftLimit() {
        return overdraft_limit;
    }

    // Returns overdrawn amount if balance is negative
    public double getOverdrawnAmount() {
        return getAccountBalance() < 0 ? Math.abs(getAccountBalance()) : 0;
    }
}
