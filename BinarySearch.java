import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

	// Initialize the array with the specified size
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");

        // Populate the array with user input
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Binary Search (Sorted Array)
        Arrays.sort(array);
        System.out.print("Enter another element to search: ");
        int target1 = sc.nextInt();

        // Perform binary search and store the result
        int result = binarySearch(array, target1);

        // Output the result of the search
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    // Method to perform binary search on a sorted array
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        // Continue searching while the left pointer is less than or equal to the right pointer
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the middle element is the target
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
