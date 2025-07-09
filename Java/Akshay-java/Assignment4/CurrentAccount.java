import java.time.LocalDate;

class CurrentAccount extends Account {
	double overdraft_limit;
	LocalDate last_overdrawn_date;
	CurrentAccount(String account_no , double account_balance ,LocalDate account_opening_date, double overdraft_limit , LocalDate last_overdrawn_date)
	{
		super(account_no , account_balance ,account_opening_date);
		this.overdraft_limit = overdraft_limit;
		this.last_overdrawn_date = last_overdrawn_date;
	}
	
	double getOverdraftLimit()
	{
		return overdraft_limit;
	}

	public double getOverdrawnAmount()
	{
		return overdraft_limit - account_balance;
	}
}
