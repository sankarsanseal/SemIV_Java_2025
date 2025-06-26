import java.util.Date;

class Account {
    String account_no;
    double account_balance;
	Date account_opening_date;
	
	Account(String account_no , double account_balance , Date account_opening_date)
	{
		this.account_no = account_no;
		this.account_balance = account_balance;
		this.account_opening_date = account_opening_date;
	}
	
	String getAccountNo()
	{
		return account_no;
	}
	
	double getAccountBalance()
	{
		return account_balance;
	}

	Date getAccountOpeningDate()
	{
		return account_opening_date;
	}
	
}