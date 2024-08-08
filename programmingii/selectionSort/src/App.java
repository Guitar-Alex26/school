public class App {
    // Alexander Quirk
    public static void selectionSort(int[] array) { 
        int n = array.length; 
        int swap;
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) { 
            // Find the minimum element in unsorted array 
            int min = i; 
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j; 
                }
            }
            // Swap the found minimum element with the first element
            swap = array[min];
            array[min] = array[i];
            array[i] = swap;
        }
        // Print sorted array
        for (int i = 0; i < (array.length); i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {6, 29, 47, 22, 7, 4, 92};
        System.out.println("Sorted array:");
        selectionSort(array);
    }
}