import java.time.LocalDate;

class SavingAccount extends Account {
    public float interest_rate;
    public double interest_accrued;
    public double interest_paid;
    public LocalDate last_interest_paid_date;

    // Constructor
    SavingAccount(String account_no, double account_balance, float interest_rate) {
        super(account_no, account_balance, LocalDate.now());
        this.interest_rate = interest_rate;
        this.interest_accrued = 0.0;
        this.interest_paid = 0.0;
        this.last_interest_paid_date = null;
    }

    // Getter methods
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
        last_interest_paid_date = LocalDate.now();
        interest_paid += interest_accrued;
    }
}
