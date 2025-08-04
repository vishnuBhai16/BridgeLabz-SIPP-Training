package Day_3_Streams;

import java.io.*;
public class FileCopyComparison {

    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {

        String sourceFile = "sourceFile.dat";         
        String bufferedCopy = "bufferedCopy.dat";     
        String unbufferedCopy = "unbufferedCopy.dat"; 

        generateLargeFile(sourceFile, 100 * 1024 * 1024); 

        long startBuffered = System.nanoTime();
        copyWithBufferedStream(sourceFile, bufferedCopy);
        long endBuffered = System.nanoTime();
        System.out.println("Buffered Stream Copy Time: " + 
            (endBuffered - startBuffered) / 1_000_000 + " ms");

        // Step 3: Copy file using unbuffered streams and measure time
        long startUnbuffered = System.nanoTime();
        copyWithUnbufferedStream(sourceFile, unbufferedCopy);
        long endUnbuffered = System.nanoTime();
        System.out.println("Unbuffered Stream Copy Time: " + 
            (endUnbuffered - startUnbuffered) / 1_000_000 + " ms");
    }


    public static void copyWithBufferedStream(String source, String destination) {
        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.err.println("Error using buffered streams: " + e.getMessage());
        }
    }

    public static void copyWithUnbufferedStream(String source, String destination) {
        try (
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination)
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.err.println("Error using unbuffered streams: " + e.getMessage());
        }
    }


    public static void generateLargeFile(String filename, int sizeInBytes) {
        File file = new File(filename);

        if (file.exists()) {
            System.out.println("File already exists: " + filename);
            return;
        }

        try (FileOutputStream fos = new FileOutputStream(file)) {
            byte[] data = new byte[BUFFER_SIZE];

            // Write empty data in chunks to simulate a large file
            for (int i = 0; i < sizeInBytes / BUFFER_SIZE; i++) {
                fos.write(data);
            }

            System.out.println("Large file created: " + filename);

        } catch (IOException e) {
            System.err.println("Failed to generate large file: " + e.getMessage());
        }
    }
}

