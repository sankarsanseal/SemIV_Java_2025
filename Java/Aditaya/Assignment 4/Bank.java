/* 
Main class where instance of different type of accounts are created and methods are used 

Author: Aditaya Samui
Date: 08-07-2025
*/

import java.time.LocalDate;       //importing Date class for Maturity Date

class Bank {
    public static void main(String[] args) {
        SavingAccount acc1 = new SavingAccount("36946390431", 3000, LocalDate.of(2023,01,01), 3.5F);
        CurrentAccount acc2 = new CurrentAccount("47812990431", 30000, LocalDate.of(2023,01,01), 100000);
        FixedDepositAccount acc3 = new FixedDepositAccount("97254529431", 300000, LocalDate.of(2023,01,01), 7.5F, 365,LocalDate.of(2027,01,01) ,12);     
        
        //Displaying balance for each account
        System.out.println("Your balance in Saving Account: "+acc1.getAccountBalance());
        acc1.addInterest();
        System.out.println("Your balance after interest in Saving Account: "+acc1.getAccountBalance());

        System.out.println("Your balance in Current Account: "+acc2.getAccountBalance());
        acc2.withdraw(5000);  //Withdrawing 5000 from Current Account
        System.out.println("Your new balance in Current Account: "+acc2.getAccountBalance());

        System.out.println("Your balance in Fixed Deposit Account: "+acc3.getAccountBalance());
        acc3.addInterest();
        System.out.println("Interest accrued in Fixed Deposit Account: "+acc3.getInterestAccrued());

    }
}
