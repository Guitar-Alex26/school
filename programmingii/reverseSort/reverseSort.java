public class reverseSort {
    // Alexander Quirk
    public static void findSmall(int[] ints) {
        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) {
                System.out.println(ints[i] + " is less than " + min);
                min = ints[i];
            } else if (ints[i] > min) {
                System.out.println(ints[i] + " is greater than " + min);
            } else {
                System.out.println(ints[i] + " is equal to " + min);
            }
        }
        System.out.println("Smallest int found: " + min);
    }

    public static int[] sortInts(int[] ints) {
        int len = ints.length;
        int swap;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < (len - 1); i++) {
            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (ints[j] < ints[min]) {
                    min = j;
                }
            }
            // Swap the found minimum element with the first element
            swap = ints[min];
            ints[min] = ints[i];
            ints[i] = swap;
        }
        // Print sorted array
        System.out.println("Sorted array: ");
        for (int i = 0; i < len; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
        return ints;
    }

    public static void reverseInts(int[] ints) {
        // Reverse sorted array
        int len = ints.length;
        int[] reversedInts = new int[len];
        // Save and update position in sortedInts array
        int pos = 0;
        for (int i = len - 1; i > -1; i--) {
            reversedInts[pos] = ints[i];
            pos++;
        }
        // Print sorted, reversed array
        System.out.println("Reversed array: ");
        for (int i = 0; i < len; i++) {
            System.out.print(reversedInts[i] + " ");
        }
    }

    public static void main(String[] args) throws Exception {
        int[] ints = { 23, 43, 35, 38, 7, 12, 76, 10, 34, 8 };
        findSmall(ints);
        reverseInts(sortInts(ints));
    }
}