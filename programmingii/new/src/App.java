import java.util.*;
public class App {
    // Alexander Quirk
    public static void main(String[] args) {
        int[] array = {23, 41, 5, 12, 50};
        Arrays.sort(array);
        Scanner in = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter a number to search for: ");
        int x = in.nextInt();
        int result = binarySearch(array, x);
        // Check if a match is found
        if (result != -1) {
            System.out.println("A match!");
        } else {
            System.out.println("No match found.");
        }
        in.close();
    }
    public static int binarySearch(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == x) {
                return mid;
            } else if (array[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}