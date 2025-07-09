import java.time.LocalDate;

public class SavingAccount extends Account {
	float interest_rate;
	double interest_accrued;
	double interest_paid;
	LocalDate last_interest_paid_date;
	
	public SavingAccount(String account_no , double account_balance , float interest_rate,LocalDate account_opening_date)
	{
		super(account_no , account_balance ,account_opening_date);
		this.interest_rate = interest_rate;
		this.interest_accrued = 0.0;
		this.interest_paid = 0.0;
		this.last_interest_paid_date = null;
	}
	
	public double getInterestAccrued()
	{
		return interest_accrued;
	}
	
	public double getInterestPaid()
	{
		return interest_paid;
	}
	
	public void addInterest()
	{
		interest_accrued = account_balance * interest_rate / 100;
		account_balance += interest_accrued;
		interest_paid += interest_accrued;
		System.out.println("Interest added: " + interest_paid);
	}
}