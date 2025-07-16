/* 
Represents a program to check if a number is prime or not.
This class takes an integer input from the user, checks whether the number is prime using the division method, and displays the result.
It optimizes the check by iterating up to the square root of the number.

Author: Pratick Dam
Date: 10-07-2025
*/
import java.util.Scanner;

public class PrimeNumberCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take input from user
        System.out.print("Enter the number to check prime or not: ");
        int num = sc.nextInt();

        //Setting up the flag variable
        boolean isprime = true;

        //Check for prime or not by division method
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                isprime = false;
            }
        }
        //Check the flag variable and printing the final result
        if(isprime){
            System.out.println("The Number "+num+" is a prime number!");
        } else {
            System.out.println("The Number "+num+" is not a prime number!");
        }
        
    }
}