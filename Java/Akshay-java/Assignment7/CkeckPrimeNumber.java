import java.util.Scanner;

public class CkeckPrimeNumber {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int flag =0;
		
        // Take input from user
		System.out.println("Enter any  number : ");
		int n = sc.nextInt();
		
		if(n<=1)
		{
			System.out.println("Error:Wrong Input\nThe given number is not catagorised under Prime number!!!");
		}
		
		else
		{
			for(int i = 2; i<n/2;i++)
			{
				if(n%i == 0)
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				System.out.println(n + "is a Prime Number!");
			}
			else
			{
				System.out.println(n + "is not a Prime Number!");
			}
		}
		sc.close();
    }
}
