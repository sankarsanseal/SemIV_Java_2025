import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object for user input

        System.out.print("Enter a number: ");
        int num = sc.nextInt();  // Read the integer input

        boolean isPrime = true;  // Assume number is prime

        if (num <= 1) {
            isPrime = false;  // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;  
                }
            }
        }

        // Print result
        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        sc.close();  // Close the scanner
    }
}
