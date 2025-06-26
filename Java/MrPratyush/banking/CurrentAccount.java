public class CurrentAccount extends Account {
    double overdraft_limit;

    public CurrentAccount(String account_no, double account_balance, double overdraft_limit) {
        super(account_no, account_balance);
        this.overdraft_limit = overdraft_limit;
    }

    public double getOverdraftLimit() {
        return overdraft_limit;
    }

    public static void main(String[] args) {
        // Create a CurrentAccount object
        CurrentAccount ca = new CurrentAccount("424710110005889", 5000.0, 2000.0);

        // Display account details
        System.out.println("Account No: " + ca.getAccountNo());
        System.out.println("Account Balance: " + ca.getAccountBalance());
        System.out.println("Overdraft Limit: " + ca.getOverdraftLimit());
    }
}
