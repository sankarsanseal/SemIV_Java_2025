import java.time.LocalDate;
public class BankingSystem {
    public static void main(String[] args)
    {
        
        SavingAccount sa = new SavingAccount("AK123",56000.365,5.7f);
        CurrentAccount cr = new CurrentAccount("Ak123", 56000.365, 60000.369);
        LocalDate maturityDate = LocalDate.of(2025, 12, 26);  // year, month, day
        FixedDepositAccount fx = new FixedDepositAccount(
            "Aki123",
            60000.50,
            7.5f,
            456,
            maturityDate,
            10);
        
        //Displaying balance for each account
        System.out.println("Your balance in Saving Account: "+ sa.getAccountBalance());
        System.out.println("Your balance in Current Account: "+ cr.getAccountBalance());
        System.out.println("Your balance in Fixed Deposit Account: "+fx.getAccountBalance());
        System.out.println("Your Maturity Date in Fixed Deposit Account: "+ fx.maturity_date);

    }
}