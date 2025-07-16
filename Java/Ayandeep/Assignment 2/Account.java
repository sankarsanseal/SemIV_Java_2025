public class Account {
    public String account_no;
    public double account_balance;

    // Constructor
    public Account(String account_no, double account_balance) {
        this.account_no = account_no;
        this.account_balance = account_balance;
    }

    // Getters
    public String getAccountNo() {
        return account_no;
    }

    public double getAccountBalance() {
        return account_balance;
    }
}
