import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        // Create Saving Account
        SavingAccount acc1 = new SavingAccount("5462246652", 5000.50, 3.5F);

        // Create Current Account
        CurrentAccount acc2 = new CurrentAccount("14259766343", 40000.75, 100000);

        // Create Fixed Deposit Account (maturity date is 1 year from now, frequency 12 months)
        FixedDepositAccount acc3 = new FixedDepositAccount("9722546213", 500000, 7.5F, 
                365, LocalDate.now().plusYears(1), 12);

        // Display balances
        System.out.println("Your balance in Saving Account: " + acc1.getAccountBalance());
        System.out.println("Your balance in Current Account: " + acc2.getAccountBalance());
        System.out.println("Your balance in Fixed Deposit Account: " + acc3.getAccountBalance());
        System.out.println("Your Maturity Date in Fixed Deposit Account: " + acc3.maturity_date);
    }
}
