package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) {

        String filePath="C:\\Users\\Ravi Jagtap\\OneDrive\\Desktop\\test.txt";
            try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }

            }
            catch(FileNotFoundException e){
                System.out.println("Could not locate file"+e);
            }
            catch(IOException e){
                System.out.println("File Not Found");
            }
    }
}
