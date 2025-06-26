import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


class SavingAccount extends Account
   {
	    float interest_rate;
	    double interest_accrued;
	    double interest_paid;
	
	SavingAccount(String account_no , double account_balance , float interest_rate)
	{
		super(account_no , account_balance);
		this.interest_rate = interest_rate;
		this.interest_accrued = 0.0;
		this.interest_paid = 0.0;
	}
	
	float getInterestRate()
	{
		return interest_rate;
	}
	
	double getInterestAccrued()
	{
		return interest_accrued;
	}
	
	double getInterestPaid()
	{
		return interest_paid;
	}
	
	void addInterest()
	{
		interest_accrued = account_balance * interest_rate / 100;
		account_balance += interest_accrued;
		interest_paid += interest_accrued;
	}
}