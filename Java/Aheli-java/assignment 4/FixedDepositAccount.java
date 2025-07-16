/* 
 Sub class for Fixed Deposit Accounts inheriting from the base Account class.
 It contains attributes to store interest rate, accrued and paid interest,
 tenure duration, maturity date, interest payment frequency, 
 and the date of last interest payment.
 It provides methods to add interest based on frequency,
 and calculate the total maturity amount.

 Author:Aheli Manna
 Date: 11-07-2025
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Represents a fixed deposit account with maturity
public class FixedDepositAccount extends Account {
    private float interest_rate;
    private double interest_accrued;
    private double interest_paid;
    private int tenure_time_in_days;
    private LocalDate maturity_date;
    private int payment_frequency;
    private LocalDate last_interest_paid_date;

    // Constructor to initialize fixed deposit account
    public FixedDepositAccount(String accNo, double balance, LocalDate openDate, float interest_rate,
                               int tenure_days, LocalDate maturity_date, int payment_frequency, LocalDate lastPaidDate) {
        super(accNo, balance, openDate);
        this.interest_rate = interest_rate;
        this.tenure_time_in_days = tenure_days;
        this.maturity_date = maturity_date;
        this.payment_frequency = payment_frequency;
        this.interest_accrued = 0;
        this.interest_paid = 0;
        this.last_interest_paid_date = lastPaidDate;
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

    // Adds interest based on time and frequency
    public void addInterest() {
        long months = ChronoUnit.MONTHS.between(last_interest_paid_date, LocalDate.now());
        if (months >= payment_frequency) {
            interest_accrued = (getAccountBalance() * interest_rate * months) / 1200;
            interest_paid += interest_accrued;
            last_interest_paid_date = LocalDate.now();
        }
    }

    // Returns maturity value including interest paid
    public double getMaturityAmount() {
        return getAccountBalance() + interest_paid;
    }
}