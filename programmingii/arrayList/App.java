import java.io.*;
import java.util.*;

public class App {
    // Alexander Quirk

    // Check if value is a number
    public static boolean isNumeric(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        String fileName = "lab4.txt";
        ArrayList<String> ints = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (isNumeric(word)) {
                        ints.add(word);
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error encountered: " + e);
        }
        System.out.println("Ints found; unsorted array:\n" + ints);
        // Selection sort algorithm
        int length = ints.size();
        for (int i = 0; i < length - 1; i++) {
            int maxIndex = i; // Initialize maxIndex to the current index
            for (int j = i + 1; j < length; j++) {
                if (Integer.valueOf(ints.get(j)) > Integer.valueOf(ints.get(maxIndex))) {
                    maxIndex = j; // Update maxIndex if a larger element is found
                }
            }
            String swap = ints.get(maxIndex);
            ints.set(maxIndex, ints.get(i));
            ints.set(i, swap);
        }

        System.out.println("Sorted array from biggest to smallest:\n" + ints);
    }
}