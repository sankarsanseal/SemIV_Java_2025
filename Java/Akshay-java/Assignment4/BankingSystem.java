
import java.util.*;

public class BankingSystem {
    public static void main(String[] args)
    {
        
        SavingAccount sa = new SavingAccount("AK123",56000.365,5.7f);
        CurrentAccount cr = new CurrentAccount("Ak123",56000.365,63.56);
        FixedDepositAccount fx = new FixedDepositAccount("Aki123",60000.50,7.5f,456,new Calendar.set(125+1900,12,26)); 
        System.out.println(fx.getMaturityDate());

    }
}
