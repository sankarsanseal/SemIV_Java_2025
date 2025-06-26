public class Account {
    String account_no;
    double account_balance;

    public Account(String account_no, double account_balance) {
        this.account_no = account_no;
        this.account_balance = account_balance;
    }

    public String getAccountNo() {
        return account_no;
    }

    public double getAccountBalance() {
        return account_balance;
    }
}
