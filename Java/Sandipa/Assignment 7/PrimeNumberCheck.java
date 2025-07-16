import java.util.*;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            int i;
            for (i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number.");
                    break;
                }
            }

            // If loop completes normally, i > sqrt(number)
            if (i > Math.sqrt(number)) {
                System.out.println(number + " is a prime number.");
            }
        }

        scanner.close();
    }
}