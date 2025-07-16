import java.util.*;
public class DecimaltoBinary {
        public static void main(String[] args) {
        // Create a Scanner object to take input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert decimal to binary using Integer.toBinaryString() method
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        // Display the result
        System.out.println("Binary representation: " + binaryNumber);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

