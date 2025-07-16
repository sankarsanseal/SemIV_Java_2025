/* 
 Java program to read a list of names from an input file,
 sort them alphabetically, and write the sorted list into an output file.
 It uses BufferedReader and BufferedWriter for file operations,
 and ArrayList with Collections.sort() for sorting logic.

 Author: Aheli Manna
 Date: 07-07-2025
*/
import java.util.*;
import java.io.*; 

public class SortNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); // List to store names
        String inputfile = "input.txt";
        String outputfile = "output.txt";
        
        // Reading names from the input file
        try (BufferedReader br = new BufferedReader(new FileReader(inputfile))) {
            String filename;
            while ((filename = br.readLine()) != null) {
                if (!filename.trim().isEmpty()) {
                    names.add(filename.trim());
                }
            }  
        } catch (IOException e) {
            System.out.println("Error Reading File: " + e.getMessage());
            return;
        }

        Collections.sort(names); // Sorting names alphabetically

        // Writing sorted names into the output file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputfile))) {
            for (String name : names) {
                bw.write(name);
                bw.newLine();
            }
            System.out.println("Names sorted!");
        } catch (IOException e) {
            System.out.println("Error Writing File: " + e.getMessage());
        }
    }    
}
