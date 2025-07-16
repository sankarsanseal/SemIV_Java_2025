import java.time.LocalDate;
public class SampleMain {
    public static void main(String[] args) {
        SavingAccount Sa = new SavingAccount("345436587", 10000, LocalDate.of(2024, 1, 1),
                4.5f, 0, 0, LocalDate.of(2024, 12, 31));
        Sa.AddInterest();
        System.out.println("Your savings Account Number: "+Sa.getAccountNo());
        System.out.println("Your Account Balance: "+Sa.getAccountBal());
        System.out.println("Your Account opening date: "+Sa.account_open_date);
        System.out.println("Your Interest rate: "+Sa.getInterestRate());
        System.out.println("Your last interest paid date: "+Sa.last_interest_paid_date);
        System.out.println("Your saving account interest accrued: "+Sa.getInterestAccrued());
        System.out.println();
        CurrentAccount ca = new CurrentAccount("46575780", 2000, LocalDate.of(2020, 6, 1),
                5000, LocalDate.of(2025, 1, 15));
        System.out.println("Your  current Account Number: "+ca.getAccountNo());
        System.out.println("Your Account Balance: "+ca.getAccountBal());
        System.out.println("Your Account Opening date: "+ca.getAccountopenDate());
        System.out.println("Your Overdraft Limit: "+ca.getOverDraftLimit());
        System.out.println("Your Last overdrawn date: "+ca.last_overdrawn_date);
        System.out.println("your current account overdrawn amount: "+ca.getOverDrawnAmmount());
        System.out.println();
        FixedDepositAccount fda = new FixedDepositAccount("FD12398", 50000, LocalDate.of(2023, 1, 1),
                6.5f,  730, LocalDate.of(2025, 1, 1), 180, LocalDate.of(2024, 1, 1));
        fda.AddInterest();
        System.out.println("Your  fixed deposite Account Number: " + fda.getAccountNo());
        System.out.println("Your Account Balance: " + fda.getAccountBal());
        System.out.println("Your Interest Rate: " + fda.getInterestRate());
        System.out.println("Your Interest Accrued: " + fda.getInterestAccrued());
        System.out.println("Your Interest Paid: " + fda.getInterest_paid());
        System.out.println("Your last interest payment date: " + fda.last_interest_paid_date);
        System.out.println("FD Maturity date: " + fda.maturity_date);
        System.out.println("FD Maturity Amount: " + fda.getMaturityAmount());
        System.out.println("FD Maturity Amount: " + fda.getMaturityAmount());
    }
}