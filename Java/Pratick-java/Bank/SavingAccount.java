import java.util.Scanner;
class SavingAccount extends Account{
    public float interest_rate;
    public double interest_accrued;
    public double interest_paid;

    SavingAccount(String account_no, double balance, float interest_rate){
        super(account_no, balance);
        this.interest_rate = interest_rate;
        this.interest_accrued = 0.00;
        this.interest_paid = 0.00;
    }

    float getInterestRate(){
        return interest_rate;
    }

    double getInterestAccrued(){
        return interest_accrued;
    }

    double getInterestPaid(){
        return interest_paid;
    }

    void AddInterest(){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Account number: ");
        String account_no = sc.nextLine();
        System.out.println("Enter your Account balance: ");
        double account_balance = sc.nextDouble();
        SavingAccount Aditaya = new SavingAccount(account_no, account_balance,5.0F);
        System.out.println("Your Account Number: "+Aditaya.getAccountNo());
        System.out.println("Your Account Balance: "+Aditaya.getAccountBal());
        System.out.println("Your Interest rate: "+Aditaya.getInterestRate());
        sc.close();
    }
}

