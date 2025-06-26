import java.util.Date;
import java.util.Scanner;

// Assuming there is a parent Account class
class Account {
    String account_no;
    double account_balance;

    public Account(String account_no, double account_balance) {
        this.account_no = account_no;
        this.account_balance = account_balance;
    }

    public String getAccountNo() {
        return account_no;
    }

    public double getAccountBalance() {
        return account_balance;
    }
}

public class FixedDepositAccount extends Account {
    float interest_rate;
    double interest_accured;
    double interest_paid;
    int tenure_time_in_days;
    Date maturity_date;
    private int payment_frequency;

    public FixedDepositAccount(String account_no, double account_balance, float interest_rate, int tenure_time_in_days, Date maturity_date, int payment_frequency) {
        super(account_no, account_balance);
        this.interest_rate = interest_rate;
        this.tenure_time_in_days = tenure_time_in_days;
        this.maturity_date = maturity_date;
        this.payment_frequency = payment_frequency;
        this.interest_accured = 0;
        this.interest_paid = 0;
    }

    public float getInterestRate() {
        return interest_rate;
    }

    public double getInterestAccured() {
        return interest_accured;
    }

    public double getInterestPaid() {
        return interest_paid;
    }

    public int getTenureTimeInDays() {
        return tenure_time_in_days;
    }

    public Date getMaturityDate() {
        return maturity_date;
    }

    public int getPaymentFrequency() {
        return payment_frequency;
    }

    public void addInterest() {
        interest_accured = account_balance * interest_rate * tenure_time_in_days / (100 * 365.0);
        interest_paid += interest_accured;
    }

    public double getMaturityAmount() {
        return account_balance + interest_accured;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Acc no: ");
        String accNo = sc.nextLine();
        
        System.out.print("Enter Acc balance: ");
        double balance = sc.nextDouble();
        
        System.out.print("Enter Interest Rate: ");
        float rate = sc.nextFloat();
        
        System.out.print("Enter Tenure (days): ");
        int tenure = sc.nextInt();
        
        System.out.print("Enter payment frequency (e.g., 12 for monthly): ");
        int frequency = sc.nextInt();
        
        // For demo purposes, we use current date as maturity date
        Date maturity = new Date();

        FixedDepositAccount fda = new FixedDepositAccount(accNo, balance, rate, tenure, maturity, frequency);
        fda.addInterest();
        
        System.out.println("Account No: " + fda.getAccountNo());
        System.out.println("Tenure: " + fda.getTenureTimeInDays() + " days");
        System.out.println("Interest Paid: " + fda.getInterestPaid());
        System.out.println("Maturity Amount: " + fda.getMaturityAmount());

        sc.close();
    }
}
