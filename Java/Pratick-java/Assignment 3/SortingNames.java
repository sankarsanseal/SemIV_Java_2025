/* 
 Java program to read a list of names from an input file,
 sort them alphabetically, and write the sorted list into an output file.
 It uses BufferedReader and BufferedWriter for file operations,
 and ArrayList with Collections.sort() for sorting logic.

 Author: Pratick Dam
 Date: 10-07-2025
*/

import java.io.*;
import java.util.*;

public class SortingNames {
    public static void main(String[] args) {

        //List to store names from file
        List<String> names = new ArrayList<>();
        String inputfile = "input.txt";
        String outputfile = "output.txt";

        //Read Names from Input file

        try(BufferedReader br = new BufferedReader(new FileReader(inputfile))){
            String fileName;
            while((fileName = br.readLine()) != null){
                if (!fileName.trim().isEmpty()) {
                    names.add(fileName.trim());
                }
            }
        } catch (IOException e){
            System.out.println("Error Reading the file!" + e.getMessage());
            return;
        }

        //Sort the names (Inbuilt func. in java)
        Collections.sort(names);

        //Write the files in output.java

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(outputfile))){
            for(String name : names){
                bw.write(name);
                bw.newLine();
            }
            System.out.println("Names Sorted Successfully!");
        } catch (IOException e){
            System.out.println("Error Writing in the file" + e.getMessage());
            return;
        }
    }
}