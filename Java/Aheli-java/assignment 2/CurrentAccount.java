/* 
 Sub class for Current Accounts inheriting data from Parent class Account.
 It has an attribute to store the overdraft limit.
 It has a constructor to initialize these values,
 and a method to retrieve the overdraft limit.

 Author: Aheli Manna
 Date: 11-07-2025
*/

// Represents a current account with overdraft
public class CurrentAccount extends Account {
    private double overdraft_limit;

    // Constructor
    public CurrentAccount(String accNo, double balance, double overdraft_limit) {
        super(accNo, balance);
        this.overdraft_limit = overdraft_limit;
    }

    public double getOverdraftLimit() {
        return overdraft_limit;
    }
}