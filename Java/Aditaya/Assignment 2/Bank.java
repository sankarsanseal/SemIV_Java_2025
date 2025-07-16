/* 
Main class where instance of different type of accounts are created and methods are used 

Author: Aditaya Samui
Date: 23-06-2025
*/

import java.time.LocalDate;       //importing Date class for Maturity Date

class Bank {
    public static void main(String[] args) {
        SavingAccount acc1 = new SavingAccount("36946390431", 3000.50, 3.5F);
        CurrentAccount acc2 = new CurrentAccount("47812990431", 30000.75, 100000);
        
        //Maturity Date for Fixed Deposit Account is set to one year from account creation date
        //Payment Frequency is set to 12 months
        FixedDepositAccount acc3 = new FixedDepositAccount("97254529431", 300000, 7.5F, 365,LocalDate.of(2027, 01, 01) ,12);     
        
        //Displaying balance for each account
        System.out.println("Your balance in Saving Account: "+acc1.getAccountBalance());
        System.out.println("Your balance in Current Account: "+acc2.getAccountBalance());
        System.out.println("Your balance in Fixed Deposit Account: "+acc3.getAccountBalance());
        System.out.println("Your Maturity Date in Fixed Deposit Account: "+acc3.maturity_date);
    }
}
