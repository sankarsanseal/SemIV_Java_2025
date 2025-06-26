import java.util.Scanner;

class CurrentAccount extends Account{
    public double overdraft_limit;

    CurrentAccount(String account_no, double account_balance, double overdraft_limit){
        super(account_no,account_balance);
        this.overdraft_limit = overdraft_limit;
    }

    double getOverDraftLimit(){
        return overdraft_limit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Account number: ");
        String account_no = sc.nextLine();
        System.out.println("Enter your Account balance: ");
        double account_balance = sc.nextDouble();

        CurrentAccount Aditaya = new CurrentAccount(account_no, account_balance,100000.00);
        System.out.println("Your Account Number: "+Aditaya.getAccountNo());
        System.out.println("Your Account Balance: "+Aditaya.getAccountBal());
        System.out.println("Your Overdraft Limit: "+Aditaya.getOverDraftLimit());
        sc.close();
    }
}
