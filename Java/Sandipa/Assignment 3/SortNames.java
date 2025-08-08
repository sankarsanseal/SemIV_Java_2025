import java.io.*;       // For file reading and writing
import java.util.*;     
public class SortNames {
    public static void main(String[] args) {
        
        // Create a list to store the names
        ArrayList<String> names = new ArrayList<>();
        // Step 1: Read names from input.txt
        try {
            // Open the file to read
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String name;
            // Read each line (name) until end of file
            while ((name = reader.readLine()) != null) {
                if (!name.trim().isEmpty()) {
                    names.add(name); // Add the name to the list
                }
            }

            reader.close(); // Close the reader

        } catch (IOException e) {
            // If there's an error in reading the file
            System.out.println("Error reading input file: " + e.getMessage());
            return;
        }
        // Step 2: Sort the list of names
        Collections.sort(names);  // This will sort alphabetically (A to Z)

        // Step 3: Write sorted names to output.txt
        try {
            // Open the file to write
            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);
            // Write each name to the file
            for (String sortedName : names) {
                writer.write(sortedName. toUpperCase());
                writer.newLine(); // Move to the next line
            }
            writer.close(); // Close the writer
            // Show message when done
            System.out.println("Names have been sorted and saved to output.txt");
        } catch (IOException e) {
            // If there's an error in writing the file
            System.out.println("Error writing to output file: " + e.getMessage());
        }
    }
}