import java.time.LocalDate;

// Base Account class
class Account {
    public String account_no;
    public double account_balance;
    public LocalDate account_open_date;

    // Constructor
    Account(String account_no, double account_balance, LocalDate account_open_date) {
        this.account_no = account_no;
        this.account_balance = account_balance;
        this.account_open_date = account_open_date;
    }

    // Getter methods
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
