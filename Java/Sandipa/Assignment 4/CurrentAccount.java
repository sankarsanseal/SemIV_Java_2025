
import java.time.LocalDate;
class CurrentAccount extends Account{
    public double overdraft_limit;
    public LocalDate last_overdrawn_date;
    CurrentAccount(String account_no, double account_balance,LocalDate account_open_date,double overdraft_limit,LocalDate last_overdrawn_date){
        super(account_no,account_balance,account_open_date);
        this.overdraft_limit = overdraft_limit;
        this.last_overdrawn_date=last_overdrawn_date;
    }
    double getOverDraftLimit(){
        return overdraft_limit;
    }
    double getOverDrawnAmmount(){
        return Math.max(0,overdraft_limit-account_balance);
    }
}
