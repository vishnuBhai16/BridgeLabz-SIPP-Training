package Day_3_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File src = new File(sourceFile);

            if (!src.exists()) {
                System.out.println("Source file does not exist: " + sourceFile);
                return;
            }

            fis = new FileInputStream(src);
            fos = new FileOutputStream(destinationFile); 
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully to " + destinationFile);
        } catch (IOException e) {
            System.out.println("An error occurred during file handling: " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error closing streams: " + e.getMessage());
            }
        }
    }
}

