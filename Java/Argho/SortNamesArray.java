import java.util.Arrays;
import java.util.Scanner;

public class SortNamesArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of names from the user
        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left-over

        // Create an array to store the names
        String[] names = new String[numNames];

        // Get the names from the user
        for (int i = 0; i < numNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Sort the array in alphabetical order
        Arrays.sort(names);

        // Print the sorted names
        System.out.println("Names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
