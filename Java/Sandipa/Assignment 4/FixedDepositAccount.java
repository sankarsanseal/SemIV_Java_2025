
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
class FixedDepositAccount extends Account {
    public float interest_rate;
    public double interest_accrued;
    public double interest_paid;
    public int tenure_time_in_days;
    public LocalDate maturity_date;
    public int payment_frequency;//in days
    public LocalDate last_interest_paid_date;
    FixedDepositAccount(String account_no, double account_balance,LocalDate account_open_date, float interest_rate, int tenure_time_in_days, LocalDate maturity_date, int payment_frequency,LocalDate last_interest_paid_date) {
        super(account_no, account_balance,account_open_date);
        this.interest_rate = interest_rate;
        this.interest_accrued = 0;
        this.interest_paid=0;
        this.tenure_time_in_days = tenure_time_in_days;
        this.maturity_date = maturity_date;
        this.payment_frequency = payment_frequency;
        this.last_interest_paid_date=last_interest_paid_date;
    }
    float getInterestRate() {
        return interest_rate;
    }
    double getInterestAccrued() {
        return interest_accrued;
    }
    double getInterest_paid() {
        return interest_paid;
    }
    double getMaturityAmount(){
        long totalDays = ChronoUnit.DAYS.between(account_open_date, maturity_date);
        double maturityInterest = account_balance * interest_rate / 100 * (totalDays / 365.0);
        return account_balance + maturityInterest;
    }
    void AddInterest() {
        LocalDate today = LocalDate.now();
        LocalDate interestEndDate = maturity_date.isBefore(today) ? maturity_date : today;
        long daysSinceLastPayment = ChronoUnit.DAYS.between(last_interest_paid_date, interestEndDate);
        long periods = daysSinceLastPayment / payment_frequency;
        if (periods > 0) {
            double interest = account_balance * interest_rate / 100 * periods;
            interest_accrued += interest;
            last_interest_paid_date = last_interest_paid_date.plusDays(periods * payment_frequency);
            }
        }
    }
