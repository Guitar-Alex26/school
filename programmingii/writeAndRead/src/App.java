
import java.io.*;
import java.util.*;

public class App {

    // Alexander Quirk
    public static void main(String[] args) throws Exception {
        // Store name for referential purposes
        String fileName = "results.txt";
        // Create empty file
        try {
            File file = new File(fileName);
            if (file.createNewFile()) { // Check if file is already made; if it does not
                System.out.println("File " + fileName + " successfully created.");
            } else { // If it does
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("IO error occured.");
            e.printStackTrace();
        }
        try {
            // Accept a string
            String message = "Hello World!";
            // Create a file object of class FileWriter
            FileWriter file = new FileWriter(fileName);
            // Read character wise from message and write into FileWriter
            for (int i = 0; i < message.length(); i++) {
                file.write(message.charAt(i));
            }
            System.out.println("Write successful!");
            // Close file
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
            e.printStackTrace();
        }
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String string = reader.nextLine();
                System.out.println(string);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
            e.printStackTrace();
        }
    }
}
