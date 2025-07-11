import java.time.LocalDate;
public class BankingSystem1 {
    public static void main(String[] args)
    {
        
        SavingAccount1 sa = new SavingAccount1("AK123",56000.365,5.7f,LocalDate.now());
        CurrentAccount1 cr = new CurrentAccount1("Ak123", 56000.365, LocalDate.now(), 60000.369, LocalDate.of(2025, 11, 13));
        LocalDate maturityDate = LocalDate.of(2025, 12, 26);  // year, month, day
        FixedDepositAccount1 fx = new FixedDepositAccount1(
            "Aki123",
            60000.50,
            LocalDate.now(),
            7.5f,
            456,
            maturityDate,
            10,
            LocalDate.of(2025, 11, 13));
        
        //Displaying balance for each account
        System.out.println("Your balance in Saving Account: "+ sa.getAccountBalance());
        System.out.println("Your balance in Current Account: "+ cr.getAccountBalance());
        System.out.println("Your balance in Fixed Deposit Account: "+fx.getAccountBalance());
        System.out.println("Your Maturity Date in Fixed Deposit Account: "+ fx.maturity_date);

    }
}