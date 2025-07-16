import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();  // Read decimal number

        // Convert to binary using built-in method
        String binary = Integer.toBinaryString(number);

        // Display result
        System.out.println("Binary equivalent: " + binary);
        
        sc.close();
    }
}
