import java.time.LocalDate;

class FixedDepositAccount extends Account {
    public float interest_rate;                 // Interest rate
    public double interest_accrued;             // Interest earned but not paid yet
    public double interest_paid;                // Total interest paid
    public int tenure_time_in_days;             // Tenure in days
    public LocalDate maturity_date;             // Maturity date
    public int payment_frequency;               // Payment frequency
    public LocalDate last_interest_paid_date;   // Last interest paid date

    // Constructor
    FixedDepositAccount(String account_no, double account_balance, float interest_rate,
                        int tenure_time_in_days, LocalDate maturity_date, int payment_frequency) {
        super(account_no, account_balance, LocalDate.now());
        this.interest_rate = interest_rate;
        this.interest_accrued = 0.0;
        this.interest_paid = 0.0;
        this.tenure_time_in_days = tenure_time_in_days;
        this.maturity_date = maturity_date;
        this.payment_frequency = payment_frequency;
        this.last_interest_paid_date = null;
    }

    // Methods
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
        last_interest_paid_date = LocalDate.now();
        interest_paid += interest_accrued;
    }

    public double getMaturityAmount() {
        return account_balance + interest_paid;
    }
}
