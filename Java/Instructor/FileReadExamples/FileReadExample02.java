package Java.Instructor.FileReadExamples;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;

public class FileReadExample02 {


    public static void main(String[] args) {

        try{
               FileReader input_file_reader = new FileReader(
                "Java/Instructor/FileReadExamples/input_names.txt");

                BufferedReader br = new BufferedReader(input_file_reader);


                FileWriter output_file_writer = new FileWriter(
                    "Java/Instructor/FileReadExamples/OUTPUT_NAMES.TXT");

                BufferedWriter bw = new BufferedWriter(output_file_writer);

                String readline = br.readLine();
                while (readline != null)
                {
                        System.err.println(readline);
                        bw.write(readline.toUpperCase());
                        bw.newLine();
                        readline = br.readLine();


                }

                bw.flush();

                br.close();
                bw.close();


        }
        catch(FileNotFoundException name_check_exception){
            System.err.println(name_check_exception.getMessage());
        }
        catch(IOException br_read_error){
            System.out.println(br_read_error);
        }

        finally{
            // br.close();
            // bw.close();
        }
    }

    
}
