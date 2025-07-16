/* 
Represents a program to check if a number is prime or not.
This class takes an integer input from the user, checks whether the number is prime using the division method, and displays the result.
It optimizes the check by iterating up to the square root of the number.

Author: Aheli Manna
Date: 12-07-2025
*/
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        
        System.out.println("Enter a number to check whether it's a prime number or not: ");
        int num = sc.nextInt();

        // Prime numbers are greater than 1
        if(num <= 1){
            System.out.println("Not a prime number");
            return;
        }

        // Check divisibility from 2 to num/2
        for (int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                System.out.println("Number is not a prime number");
                return;
            }
        }

        // If no divisors found, it's a prime
        System.out.println("Number is a prime number");
        sc.close();  
    }
}
