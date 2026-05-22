package files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {
        //** write files

        // How to write a files using java=

        // FileWriter == Good for small or medium type of text files
        // BufferWriter==Better performance for the large amounts of text
        // PrintWriter==Best for structured data like reports or logs

            String filePath="C:\\Users\\Ravi Jagtap\\OneDrive\\Desktop\\test.txt";
            String fileContent = "Hello Students\nHi this is Ravi , a fullstack web developer";

            try(FileWriter filewriter=new FileWriter(filePath,true)){
                filewriter.write(fileContent);
                System.out.println("File has been written");

            }
            catch (FileNotFoundException e) {
                System.out.println("Could not found file location");
            }
            catch (IOException ioe){
                System.out.println("could not write to file");
            }
    }
}
