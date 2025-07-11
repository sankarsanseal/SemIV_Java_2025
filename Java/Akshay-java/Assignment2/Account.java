class Account {
	String account_no;
	double account_balance;
	
	Account(String account_no , double account_balance )
	{
		this.account_no = account_no;
		this.account_balance = account_balance;
	}
	
	String getAccountNo()
	{
		return account_no;
	}
	
	double getAccountBalance()
	{
		return account_balance;
	}
	
}