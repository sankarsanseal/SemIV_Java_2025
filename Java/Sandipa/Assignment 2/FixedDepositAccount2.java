import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class FixedDepositAccount2 extends Account2 { 
    public float interest_rate;
    public double interest_accrued; 
    public double interest_paid; 
    public int tenure_time_in_days;
    public LocalDate maturity_date;
    public int payment_frequency;

    public FixedDepositAccount2(String account_no, double account_balance, float interest_rate,
                           int tenure_time_in_days, LocalDate maturity_date, int payment_frequency) {
        super(account_no, account_balance);
        this.interest_rate = interest_rate;
        this.tenure_time_in_days = tenure_time_in_days;
        this.maturity_date = maturity_date;
        this.payment_frequency = payment_frequency;
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
        long totalPeriods = tenure_time_in_days / payment_frequency;
        double interest = account_balance * interest_rate / 100 * totalPeriods;
        interest_accrued += interest;
    }
    public double getMaturityAmount() {
        long days = ChronoUnit.DAYS.between(LocalDate.now(), maturity_date);
        if (days <= 0) {
            double maturityInterest = account_balance * interest_rate / 100 * (tenure_time_in_days / 365.0);
            return account_balance + maturityInterest;
        } else {
            return account_balance;
        }
    }
}
