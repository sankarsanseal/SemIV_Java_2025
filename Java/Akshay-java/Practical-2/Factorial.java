import java.util.*;

public class Factorial 
{
    public static void main(String args[])
    {
        int fact =1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of the number : ");
        int n =sc.nextInt();
        for(int i = 1;i <= n;i++)
        {
            fact *=i;
        }

        System.out.print("The factorial of the given number is : " + fact);
        sc.close();
    }
}