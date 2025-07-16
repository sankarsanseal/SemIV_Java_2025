
import java.time.LocalDate;
class SavingAccount extends Account{
    public float interest_rate;
    public double interest_accrued;
    public double interest_paid;
    public LocalDate last_interest_paid_date;
    SavingAccount(String account_no, double balance,LocalDate account_open_date,float interest_rate,double interest_accrued,double interest_paid,LocalDate last_interest_paid_date){
        super(account_no, balance,account_open_date);
        this.interest_rate = interest_rate;
        this.interest_accrued=interest_accrued;
        this.interest_paid=interest_paid;
        this.last_interest_paid_date=last_interest_paid_date;
    }
    float getInterestRate(){
        return interest_rate;
    }
    double getInterestAccrued(){
        return interest_accrued;
    }
    double getInterestPaid(){
        return interest_paid;
    }
    void AddInterest(){
        interest_accrued+=account_balance*interest_rate/100;
    }
}