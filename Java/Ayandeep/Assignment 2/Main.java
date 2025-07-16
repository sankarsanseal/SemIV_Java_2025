import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SavingAccount acc1 = new SavingAccount("8071475147", 5000.80, 3.8F);
        CurrentAccount acc2 = new CurrentAccount("7074397106", 40000.32, 100000);
        FixedDepositAccount acc3 = new FixedDepositAccount
        FixedDepositAccount acc4=new FixedDepositAccount
        (
            "9875648579", 200000, 6.5F, 365, LocalDate.now().plusYears(1), 12
        );

        // Displaying balance for each account
        System.out.println("Your balance in Saving Account: " + acc1.getAccountBalance());
        System.out.println("Your balance in Current Account: " + acc2.getAccountBalance());
        System.out.println("Your balance in Fixed Deposit Account: " + acc3.getAccountBalance());
        System.out.println("Your Maturity Date in Fixed Deposit Account: " + acc3.maturity_date);
    }
}
