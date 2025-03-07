import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine();  // Reads a full line
            
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            System.out.println("Error reading input.");
        } finally {
            try {
                reader.close();  // Close the reader
            } catch (IOException e) {
                System.out.println("Error closing reader.");
            }
        }
    }
}

