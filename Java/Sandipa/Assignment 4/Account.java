import java.time.LocalDate;
public class Account {
    public String account_no;
    public double account_balance;
    protected LocalDate account_open_date;
    Account(String no, double bal,LocalDate account_open_date){
        account_no = no;
        account_balance = bal;
        this.account_open_date=account_open_date;
    }
    String getAccountNo(){
        return account_no;
    }
    double getAccountBal(){
        return account_balance;
    }
    LocalDate getAccountopenDate(){
        return account_open_date;
    }
}
