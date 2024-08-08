import java.util.*;
public class App2 {
    // Alexander Quirk
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(23, 41, 5, 12, 50));
        Scanner in = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter a number to search for: ");
        int x = in.nextInt();
        int result = binarySearch(list, x);
        // Check if a match is found
        if (result != -1) {
            System.out.println("A match!");
        } else {
            System.out.println("No match found.");
        }
        in.close();
    }
    public static int binarySearch(ArrayList<Integer> list, int x) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = list.get(mid);
            if (midValue == x) {
                return mid;
            } else if (midValue < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}