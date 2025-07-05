package Java.Instructor.FileReadExamples;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;

public class FileReadExample01 {


    public static void main(String[] args) {
        try{
               FileReader file_reader = new FileReader(
                "Java/Instructor/FileReadExamples/input_names.txt");

                BufferedReader br = new BufferedReader(file_reader);

                String readline = br.readLine();
                while (readline != null)
                {
                        System.err.println(readline);
                        readline = br.readLine();
                }




        }
        catch(FileNotFoundException name_check_exception){
            System.err.println(name_check_exception.getMessage());
        }
        catch(IOException br_read_error){
            System.out.println(br_read_error);
        }

        finally{
            
        }
    }

    
}
