package StandardInputandFileHandling.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        //to store the output file
        String filePath = "src/StandardImputandFileHandling/FileHandling/file.txt";
        //read the original file
        String inputPath = "C:\\Users\\veron\\OneDrive\\Escritorio\\Ironhack\\JAVA\\movies_directors_20250426.csv";

        //Create output file with FILE CLASS
        //Adding confirmation
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            System.out.println("Successfully created");
            //opened the file to read
            File fileDataMovies = new File(inputPath);
            try (Scanner scanner = new Scanner(fileDataMovies)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    fileWriter.write(line + "\n");
                }
                System.out.println("Successfully copied");
            } catch (IOException e){
                System.err.println("File not found" + e.getMessage());
            }
        } catch (IOException e){
            System.err.println("File not created or not wrote" + e.getMessage());
        }
    }
    //Here, e is an instance of the IOException class.
    //If an error occurs when trying to open or read the file
    // (for example, the file doesn't exist, you don't have permissions, etc.),
    // the program enters this block, and you can use e to get error details, like this:
    //e.getMessage() gives you a descriptive error message

}
