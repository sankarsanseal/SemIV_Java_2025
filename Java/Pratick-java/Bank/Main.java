import java.util.*;
import java.time.LocalDate;
class Main{
    public static void main(String[] args) {
        SavingAccount acc1 = new SavingAccount("35346346",365.89,5.0F);
        FixedDepositAccount acc2 = new FixedDepositAccount("35346346",365.89,5.0F,365,LocalDate.now(),12);
        CurrentAccount acc3 = new CurrentAccount("35346346",365.89,100000);
        System.out.println("The interest rate is: "+acc2.getInterestRate());
    }
}
