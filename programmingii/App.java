import java.io.*;
import java.util.*;

public class App {
    // Alexander Quirk

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        String fileName = "lab4.txt";
        // Declare ArrayList of ints; name it numbers
        ArrayList<String> ints = new ArrayList<String>(); // Initialize ArrayList object
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                // For each word in words, if it is a number, add it to ArrayList numbers
                for (String word : words) {
                    try {
                        if (isNumeric(word)) {
                            ints.add(word);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error encountered: " + e);
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            // Display exception
            System.out.println("Error encountered: " + e);
        }
        // Print the numbers array
        System.out.println("Unsorted array:\n" + ints);
    }
    // Implement search algorithm to sort ArrayList from biggest to smallest
}