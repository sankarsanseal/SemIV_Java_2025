/* Program to read a text file containing list of names and 
save these names in sorted manner in a new text file */

import java.io.*;
import java.util.Arrays;

public class FileHandling {
    public static void main(String[] args) {
        
        try {
            FileReader fr = new FileReader("input.txt");    //File Reader
            BufferedReader br = new BufferedReader(fr);

            String lines = br.readLine();       //read the file line by line
            int n=0;      //Counts number of lines in the file

            while (lines!=null) {
                n++;        
                lines = br.readLine();      //reads next line
            }

            //Reading the file again to store names in array
            FileReader fr2 = new FileReader("input.txt");    //Reinitialize File Reader
            br = new BufferedReader(fr2);

            String[] names = new String[n];    //Array of String to stores the names
            int i=0;      //Index for array

            lines = br.readLine();       //read the file line by line
            while (lines!=null) {
                names[i++]=lines;  //stores the names in array  
                lines = br.readLine();      //reads next line
            }

            Arrays.sort(names);        //sorts the array of names

            System.out.println("Names in sorted order are:\n");
            for(i=0;i<names.length;i++) {
                if(names[i]==null)
                    break;
                System.out.println(names[i]);
            }

            FileWriter fw = new FileWriter("output.txt");    //File Writer
            BufferedWriter bw = new BufferedWriter(fw);

            for(i=0;i<names.length;i++) {
                if(names[i]==null)              //Takes the names from array and write it in output.txt
                    break;
                bw.write(names[i]);
                bw.newLine();
            }

            bw.flush();     //Clears the buffer and write in files
            br.close();     //closing the buffered writer and reader
            bw.close();

        }

        //Handling Exceptions
        catch(FileNotFoundException fe){
            System.err.println(fe.getMessage());
        }

        catch(IOException ioe) {
            System.err.println(ioe.getMessage());
        }

    }
}