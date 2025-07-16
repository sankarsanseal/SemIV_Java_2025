import java.time.LocalDate;
public class SampleMain2 { 
    public static void main(String[] args) { 
        // Test SavingAccount 
        SavingAccount2 sa = new SavingAccount2("SA123664", 10000.0, 4.5f);
        sa.addInterest();
        System.out.println("Your savings Account Number: "+sa.getAccountNo());
        System.out.println("Your Account Balance: "+sa.getAccountBalance());
        System.out.println("[SavingAccount] Interest Accrued: " + sa.getInterestAccrued());
        // Test CurrentAccount
        CurrentAccount2 ca = new CurrentAccount2("CA456346", 5000.0, 2000.0);
        System.out.println("Your current Account Number: "+ca.getAccountNo());
        System.out.println("Your Account Balance: "+ca.getAccountBalance());
        System.out.println("[CurrentAccount] Overdraft Limit: " + ca.getOverdraftLimit());
        System.out.println("[CurrentAccount] Overdraft Ammount: " + ca.getOverDrawnAmmount());
        // Test FixedDepositAccount
        FixedDepositAccount2 fda = new FixedDepositAccount2("FDA78956", 56000.0, 6.5f,
            365, LocalDate.now().minusDays(30), 90);
        fda.addInterest();
        System.out.println("Your Fixed deposite account Account Number: "+fda.getAccountNo());
        System.out.println("Your Account Balance: "+fda.getAccountBalance());
        System.out.println("[FixedDepositAccount] Interest Accrued: " + fda.getInterestAccrued());
        System.out.println("[FixedDepositAccount] Maturity Amount: " + fda.getMaturityAmount());
    }
}