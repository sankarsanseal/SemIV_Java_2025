public class SavingAccount extends Account {
    float interest_rate;
    double interest_accured;
    double interest_paid;

    public SavingAccount(String account_no, double account_balance, float interest_rate) {
        super(account_no, account_balance);
        this.interest_rate = interest_rate;
        this.interest_accured = 0;
        this.interest_paid = 0;
    }

    public float getInterestRate() {
        return interest_rate;
    }

    public double getInterestAccured() {
        return interest_accured;
    }

    public double getInterestPaid() {
        return interest_paid;
    }

    public void addInterest() {
        interest_accured = account_balance * interest_rate / 100;
        interest_paid += interest_accured;
        account_balance += interest_accured;
    }

    public static void main(String[] args) {
        // Creating a SavingAccount object
        SavingAccount sa = new SavingAccount("424710110012886", 10000.0, 5.0f);

        // Displaying details before interest
        System.out.println("Account Number: " + sa.getAccountNo());
        System.out.println("Initial Balance: " + sa.getAccountBalance());
        System.out.println("Interest Rate: " + sa.getInterestRate() + "%");

        // Adding interest
        sa.addInterest();

        // Displaying details after interest
        System.out.println("\nAfter Adding Interest:");
        System.out.println("Interest Accrued: " + sa.getInterestAccured());
        System.out.println("Interest Paid: " + sa.getInterestPaid());
        System.out.println("Updated Balance: " + sa.getAccountBalance());
    }
}
