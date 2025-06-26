import java.util.Scanner;
import java.time.LocalDate;

class FixedDepositAccount extends Account {
    public float interest_rate;
    public double interest_accrued;
    public double interest_paid;
    public int tenure_time_in_days;
    public LocalDate maturity_date;
    public int payment_frequency;

    FixedDepositAccount(String account_no, double account_balance, float interest_rate, int tenure_time_in_days, LocalDate maturity_date, int payment_frequency) {
        super(account_no, account_balance);
        this.interest_rate = interest_rate;
        this.interest_accrued = 0;
        this.tenure_time_in_days = tenure_time_in_days;
        this.maturity_date = maturity_date;
        this.payment_frequency = payment_frequency;
    }

    float getInterestRate() {
        return interest_rate;
    }

    double getInterestAccrued() {
        return interest_accrued;
    }

    double getInterest_paid() {
        return interest_paid;
    }

    // double getMaturityAmount(){

    // }

    void AddInterest() {
        // Interest calculation logic goes here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Account number: ");
        String account_no = sc.nextLine();
        System.out.println("Enter your Account balance: ");
        double account_balance = sc.nextDouble();

        FixedDepositAccount Aditaya = new FixedDepositAccount(
            account_no,
            account_balance,
            5.0f,
            365,
            LocalDate.now(), // using LocalDate
            12
        );

        System.out.println("Your Account Number: " + Aditaya.getAccountNo());
        System.out.println("Your Account Balance: " + Aditaya.getAccountBal());
        System.out.println("Your Interest Rate: " + Aditaya.getInterestRate());
        System.out.println("Your Interest Accrued: " + Aditaya.getInterestAccrued());
        System.out.println("Your Interest Paid: " + Aditaya.getInterest_paid());

        sc.close();
    }
}

