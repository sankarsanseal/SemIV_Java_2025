public class SavingAccount extends Account {
    public float interest_rate;
    public double interest_accrued;
    public double interest_paid;

    public SavingAccount(String account_no, double account_balance, float interest_rate) {
        super(account_no, account_balance);
        this.interest_rate = interest_rate;
        this.interest_accrued = 0.0;
        this.interest_paid = 0.0;
    }

    public float getInterestRate() {
        return interest_rate;
    }

    public double getInterestAccrued() {
        return interest_accrued;
    }

    public double getInterestPaid() {
        return interest_paid;
    }

    public void addInterest() {
        interest_accrued = account_balance * interest_rate / 100;
        account_balance += interest_accrued;
        interest_paid += interest_accrued;
    }
}
