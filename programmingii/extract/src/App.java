import java.io.*;
import java.util.*;
public class App {
    // Alexander Quirk
    // String fileName: name of file to write to; String content: content to be written to file: fileName
    public static void write(String fileName, String content) {
        // Writing to file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            // String to write to file
            writer.write(content);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Read from text file; store lines in ArrayList
    public static ArrayList<String> readLines(String fileName) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            // ArrayList to store lines
            // Make new BufferedReader object; pass "fileName" string
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            // Stores one line at a time to be then be passed into an ArrayList
            String line;
            while ((line = reader.readLine()) != null) {
                // Add line to ArrayList lines
                lines.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }
    // Sort given ArrayList; expecting an ArrayList of <String>
    public static ArrayList<Integer> parse(ArrayList<String> ints) {
        ArrayList<Integer> parsedInts = new ArrayList<>();
        // Loop through each String in the ArrayList<String>
        for (String line : ints) {
            // Split each String using comma as a delimiter
            String[] numberStrings = line.split(",");
            // Parse each number and add it to the ArrayList<Integer>
            for (String numberString : numberStrings) {
                int num = Integer.parseInt(numberString.trim());
                parsedInts.add(num);
            }
        }
        return parsedInts;
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> ints) {
        int min, swap, length;
        length = ints.size();
        for (int i = 0; i < length; i++) {
            min = i;
            for (int j = i + 1; j < length; j++) {
                if (ints.get(j) < ints.get(min)) {
                    min = j;
                }
            }
            swap = ints.get(min);
            ints.set(min, ints.get(i));
            ints.set(i, swap);
        }
        return ints;
    }
    public static void main(String[] args) throws Exception {
        // Store name of file
        String fileName = "numbers.txt";
        String content = "10,31,9,20,100,1,20,16,3,25,1973,8,7,1999";
        // Create file so the program can run properly
        write(fileName, content);
        // readLines is called to store lines from fileName into an ArrayList called numbers
        ArrayList<String> numbers = readLines(fileName);
        // Print size of numbers
        System.out.println("ArrayList size: " + numbers.size());
        // Print ArrayList: numbers as is
        System.out.println("numbers as is: " + numbers);
        // Parse each line of ArrayList: numbers
        ArrayList<Integer> ints = parse(numbers);
        // Print parsed numbers (now stored as ArrayList ints)
        System.out.print("Parsed ints: ");
        for (int i = 0; i < ints.size(); i++) {
            System.out.print(ints.get(i) + " ");
        }
        // Print "nothing" for visual clarity
        System.out.println("");
        // Sort ints
        ArrayList<Integer> sortedInts = sort(ints);
        // Print sorted ints
        System.out.print("Sorted ints: ");
        for (int i = 0; i < sortedInts.size(); i++) {
            System.out.print(sortedInts.get(i) + " ");
        }
    }
}