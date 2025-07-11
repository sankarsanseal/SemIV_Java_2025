import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Arrays;

public class SortNmaesFile {

	public static void main(String[] args) {
		try {
			
			// Step 1: Count total lines in input.txt to determine array size
			FileReader input_file_reader = new FileReader("input.txt");
			
			BufferedReader br = new BufferedReader(input_file_reader);
			
			int count = 0;
			
            while (br.readLine() != null) {
                count++;
            }
            br.close();
			
         // Step 2: Create an array of that size and read names into it
            String[] names = new String[count];
            br = new BufferedReader(new FileReader("input.txt"));
            String readline = br.readLine();;
            int index = 0;

            while (readline != null) {
                names[index++]=readline;  //stores the names in array  
                readline = br.readLine();      //reads next line
            }
            br.close();

         // Step 3: Sort the array
            Arrays.sort(names); // Alphabetical order (A to Z)

            // Step 4: Write the sorted names to output.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
            writer.close();

            System.out.println("Sorted names saved to output.txt");
		}
		catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

	}

}