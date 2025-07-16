/*
 * File Sorting Program
 * Author: Ayandeep Ghosh
 * Roll No: [Write your roll number here]
 *
 * Reads names from input.txt, sorts them alphabetically,
 * and writes the result to output.txt
 */

import java.io.*;
import java.util.*;

public class SortNamesFromFile {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        try {
            // Step 1: Read from input.txt
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    names.add(line.trim());
                }
            }
            reader.close();

            // Step 2: Sort the names alphabetically
            Collections.sort(names);

            // Step 3: Write to output.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
            writer.close();

            System.out.println("Names have been sorted and saved to output.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}