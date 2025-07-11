import java.time.LocalDate;

class FixedDepositAccount extends Account {
	float interest_rate;
	double interest_accrued;
	double interest_paid;
	int tenure_time_in_days;
	LocalDate maturity_date;
	int payment_frequency;
	
	FixedDepositAccount(String account_no, double account_balance, float interest_rate , int tenure_time_in_days , LocalDate maturity_date , int payment_frequency)
	{
		super(account_no , account_balance);
		this.interest_rate = interest_rate;
		this.interest_accrued = 0.0;
		this.interest_paid = 0.0;
		this.tenure_time_in_days = tenure_time_in_days;
		this.maturity_date = maturity_date;
		this.payment_frequency = payment_frequency;
	}
	
	float getInterestRate() {
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
		interest_paid += interest_accrued;
	}
	
	double getMaturityAmount()
	{
		return account_balance + interest_paid;
	}
	
}