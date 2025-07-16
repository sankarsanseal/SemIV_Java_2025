/* 
 Sub class for Saving Accounts inheriting from the base Account class.
 It contains attributes to manage interest rate, interest accrued, interest paid,
 and the date when interest was last paid.
 It provides a method to calculate and add monthly interest 
 based on the time elapsed using ChronoUnit.

 Author: Pratick Dam
 Date: 10-07-2025
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Represents a savings account with interest calculation
public class SavingAccount extends Account {
    private float interest_rate;
    private double interest_accrued;
    private double interest_paid;
    private LocalDate last_interest_paid_date;

    // Constructor to initialize savings account
    public SavingAccount(String accNo, double balance, LocalDate openDate, float interest_rate, LocalDate lastPaidDate) {
        super(accNo, balance, openDate);
        this.interest_rate = interest_rate;
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

    // Adds interest based on months passed since last payment
    public void addInterest() {
        long months = ChronoUnit.MONTHS.between(last_interest_paid_date, LocalDate.now());
        if (months > 0) {
            interest_accrued = (getAccountBalance() * interest_rate * months) / 1200;
            interest_paid += interest_accrued;
            last_interest_paid_date = LocalDate.now();
        }
    }
}
