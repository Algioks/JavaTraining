package usingFilesInProgram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

    public static void main(String[] args) {

        // 1. Define the file path
        String fileName = "C:\\Users\\PC\\Desktop\\projects\\JavaTraining\\Files\\FileToWriteText.txt";
        String message = "I am writing data to newly created file";

        // 2. Create the file in Java
        File file = new File(fileName);


        try {
            // 3. Open the file
            FileWriter fw = null;

            fw = new FileWriter(file);

            // 4. Write to the file
            fw.write(message);

            // 5. Close the resources
            fw.close();
        } catch (IOException e) {
            System.out.println("ERROR: Could not read the file: " + fileName );
            e.printStackTrace();
        } finally {
            System.out.println("Closing the file writer");
        }

    }
}
