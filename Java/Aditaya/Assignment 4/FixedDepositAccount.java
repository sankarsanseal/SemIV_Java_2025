/* Sub class for Fixed Deposit Accounts inheriting data from Parent class Account */

import java.time.LocalDate;

class FixedDepositAccount extends Account{
    public float interest_rate;                 //Stores the percentage a bank pays over time
    public double interest_accrued;             //Stores interest that has been earned but not paid yet
    public double interest_paid;                //Stores total interest that has been paid
    public int tenure_time_in_days;             //Total duration of fixed deposit
    public LocalDate maturity_date;             //The Date at which fixed deposit terms end
    public int payment_frequency;               //Stores the payment frequency
    public LocalDate last_interest_paid_date;   //Stores the date of last paid interest

    //Constructor
    FixedDepositAccount(String account_no, double account_balance, float interest_rate, 
    int tenure_time_in_days, LocalDate maturity_date, int payment_frequency) {
        super(account_no, account_balance, LocalDate.now());
        this.interest_rate=interest_rate;
        interest_accrued=0.0;
        interest_paid=0.0;
        this.tenure_time_in_days=tenure_time_in_days;
        this.maturity_date=maturity_date;
        this.payment_frequency=payment_frequency;
        last_interest_paid_date=null;           //No Interest has been paid yet
    }

    //Methods
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
        interest_accrued=account_balance*interest_rate/100;
        last_interest_paid_date=LocalDate.now();
        interest_paid+=interest_accrued;
    }

    public double getMaturityAmount() {
        return account_balance+interest_paid;
    }

}
