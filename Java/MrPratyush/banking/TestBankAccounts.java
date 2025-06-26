import java.util.Date;
import java.text.SimpleDateFormat;

public class TestBankAccounts {
    public static void main(String[] args) {
        System.out.println("=== Current Account ===");
        CurrentAccount ca = new CurrentAccount("42471011002776", 5200.0, 2000.0);
        System.out.println("Account No: " + ca.getAccountNo());
        System.out.println("Balance: " + ca.getAccountBalance());
        System.out.println("Overdraft Limit: " + ca.getOverdraftLimit());

        System.out.println("\n=== Saving Account ===");
        SavingAccount sa = new SavingAccount("424710110005889", 10000.0, 4.5f);
        System.out.println("Account No: " + sa.getAccountNo());
        System.out.println("Initial Balance: " + sa.getAccountBalance());
        sa.addInterest();
        System.out.println("Interest Accrued: " + sa.getInterestAccured());
        System.out.println("New Balance: " + sa.getAccountBalance());

        System.out.println("\n=== Fixed Deposit Account ===");
        Date maturityDate = new Date();  // For simplicity, use current date
        FixedDepositAccount fda = new FixedDepositAccount("424710110007889", 20000.0, 6.5f, 180, maturityDate, 12);
        fda.addInterest();
        System.out.println("Account No: " + fda.getAccountNo());
        System.out.println("Interest Paid: " + fda.getInterestPaid());
        System.out.println("Maturity Amount: " + fda.getMaturityAmount());
        System.out.println("Tenure (days): " + fda.getTenureTimeInDays());
        System.out.println("Maturity Date: " + new SimpleDateFormat("dd-MM-yyyy").format(fda.getMaturityDate()));
    }
}
