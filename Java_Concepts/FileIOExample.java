import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        String filename = "sample.txt";

        // Write to file (try-with-resources)
        try (PrintWriter out = new PrintWriter(new FileWriter(filename))) {
            out.println("Hello file");
            out.println("Line 2");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        // Read file
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}