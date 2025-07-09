/* Main class where instance of other classes are created and methods are used */

import java.time.LocalDate;       //importing Date class for Maturity Date

class Bank {
    public static void main(String[] args) {
        SavingAccount acc1 = new SavingAccount("36946390431", 3000.5, 3.5F);
        CurrentAccount acc2 = new CurrentAccount("47812990431", 30000.5, 100000);
        FixedDepositAccount acc3 = new FixedDepositAccount("97254529431", 300000, 7.5F, 365,LocalDate.now().plusYears(1) ,12);     
        //new Date() create a new object with current time and date
        
        //Displaying balance for each account
        System.out.println("Your balance in Saving Account: "+acc1.getAccountBalance());
        System.out.println("Your balance in Current Account: "+acc2.getAccountBalance());
        System.out.println("Your balance in Fixed Deposit Account: "+acc3.getAccountBalance());
        System.out.println("Your Maturity Date in Fixed Deposit Account: "+acc3.maturity_date);
    }
}