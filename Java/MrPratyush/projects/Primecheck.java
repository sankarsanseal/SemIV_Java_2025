import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean flag = false;

        // 0 and 1 are not prime numbers
        if (num == 0 || num == 1) {
            flag = true;
        }

        for (int i = 2; i <= num / 2; ++i) {
            // condition for un-prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        scanner.close();
    }
}
