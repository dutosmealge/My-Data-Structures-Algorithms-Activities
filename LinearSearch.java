import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n]; // Initialize the array with the specified size
        System.out.println("Enter the elements of the array: ");

        // Populate the array with user input
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Linear Search
        System.out.print("Enter the value to search using Linear Search: ");
        // Get the target value to search for
        int target = sc.nextInt();

        // Perform linear search and get the index of the target
        int index = linearSearch(array, target);

        // Output the result of the search
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    // Method to perform linear search
    public static int linearSearch(int[] array, int target) {
        // Iterate through the array to find the target
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
		// Return the index if found
                return i;
            }
        }
        // Return -1 if the target is not found
        return -1;
    }
}
