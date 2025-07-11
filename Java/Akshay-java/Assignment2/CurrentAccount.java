class CurrentAccount extends Account {
	double overdraft_limit;

	CurrentAccount(String account_no , double account_balance ,double overdraft_limit)
	{
		super(account_no , account_balance);
		this.overdraft_limit = overdraft_limit;
	}
	
	double getOverdraftLimit()
	{
		return overdraft_limit;
	}
}
