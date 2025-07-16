import java.util.Scanner;

public class convertBinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the binary number from the user
        System.out.print("Enter a binary number: ");
        long num = scanner.nextLong();

        // Validate the binary number
        while (!isBinary(num)) {
            System.out.println("Invalid binary number. Please enter a number containing only 0s and 1s.");
            System.out.print("Enter a binary number: ");
            num = scanner.nextLong();
        }

        // Call method by passing the binary number
        int decimal = convertBinaryToDecimal(num);

        System.out.println("Binary to Decimal");
        System.out.println(num + " = " + decimal);

        scanner.close();
    }

    // Method to convert binary to decimal
    public static int convertBinaryToDecimal(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;

        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }

        return decimalNumber;
    }

    // Method to validate binary number
    public static boolean isBinary(long num) {
        while (num != 0) {
            long digit = num % 10;
            if (digit != 0 && digit != 1) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
