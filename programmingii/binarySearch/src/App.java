import java.io.*;
import java.util.*;

public class App {
    // Alexander Quirk
    public static void main(String[] args) {
        String fileName = "lab3.txt";
        double[] array = new double[100];
        int count = 0; // Number of numbers found
        try {
            // Read file
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            System.out.println("\n*END OF FILE*");
            // Reset scanner
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    array[count] = scanner.nextDouble();
                    count++;
                } else {
                    scanner.next(); // Skip non-double token
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
        // Find the smallest number and its location
        if (count > 0) {
            double smallestNumber = array[0];
            int smallestIndex = 0;
            for (int i = 1; i < count; i++) {
                if (array[i] < smallestNumber) {
                    smallestNumber = array[i];
                    smallestIndex = i;
                }
            }
            // Print the smallest number and its location
            System.out.println("\nSmallest number is " + smallestNumber + " at location " + smallestIndex);
        } else {
            System.out.println("No numbers found in the file.");
        }
        // Print the numbers found
        System.out.println("\nNumbers found: " + count + "\n\nNumbers found in the file:");
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }
}