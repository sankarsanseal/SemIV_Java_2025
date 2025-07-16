public class CurrentAccount extends Account {
    public double overdraft_limit;

    public CurrentAccount(String account_no, double account_balance, double overdraft_limit) {
        super(account_no, account_balance);
        this.overdraft_limit = overdraft_limit;
    }

    public double getOverdraftLimit() {
        return overdraft_limit;
    }
}
