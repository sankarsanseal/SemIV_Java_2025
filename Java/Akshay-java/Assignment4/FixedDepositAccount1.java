import java.time.LocalDate;

class FixedDepositAccount1 extends Account1 {
	float interest_rate;
	double interest_accrued;
	double interest_paid;
	int tenure_time_in_days;
	LocalDate maturity_date;
	int payment_frequency;
	LocalDate last_interest_paid_date;
	
	FixedDepositAccount1(String account_no, double account_balance, LocalDate account_opening_date, float interest_rate , int tenure_time_in_days , LocalDate maturity_date , int payment_frequency ,LocalDate last_interest_paid_date)
	{
		super(account_no , account_balance ,account_opening_date);
		this.interest_rate = interest_rate;
		this.interest_accrued = 0.0;
		this.interest_paid = 0.0;
		this.tenure_time_in_days = tenure_time_in_days;
		this.maturity_date = maturity_date;
		this.payment_frequency = payment_frequency;
		this.last_interest_paid_date =  last_interest_paid_date;
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
	
	LocalDate getMaturityDate()
	{
		return maturity_date;
	}
}