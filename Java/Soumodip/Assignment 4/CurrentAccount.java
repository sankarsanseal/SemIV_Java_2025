import java.time.LocalDate;

class CurrentAccount extends Account {
    public double overdraft_limit;           // Overdraft limit
    public LocalDate last_overdrawn_date;    // Last overdraw date

    // Constructor
    CurrentAccount(String account_no, double account_balance, double overdraft_limit) {
        super(account_no, account_balance, LocalDate.now());
        this.overdraft_limit = overdraft_limit;
        this.last_overdrawn_date = null;
    }

    // Getter methods
    public double getOverdraftLimit() {
        return overdraft_limit;
    }

    public double getOverdrawnAmount() {
        if (account_balance < 0) {
            return -account_balance;
        }
        return 0.0;
    }
}
