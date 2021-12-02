package usingFilesInProgram;

import java.io.*;

public class Read {

    public static void main(String[] args) {
        // 1. Define the file path that we want to read
        String fileName = "C:\\Users\\PC\\Desktop\\projects\\JavaTraining\\Files\\text.txt";
        String text = null;

        // 2. Create the file in Java
        File file = new File(fileName);

        // 3. Open the file
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            // 4. Read the file
            text = br.readLine();

            // 5. Close the resources
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: THe file is not found: "+ fileName);
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            System.out.println("Finished reading the file");}


    }
}
