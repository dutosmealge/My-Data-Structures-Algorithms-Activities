import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner ash = new Scanner(System.in);

        // Dictate the user to enter the size of elements
        System.out.print("Enter the size of elements: ");
        int size = ash.nextInt();

        // Create an array to hold the elements
        int[] array = new int[size];

        // Dictate the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = ash.nextInt();
        }

        // Call the bubbleSort method to sort the array
        bubbleSort(array);

        // Display the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));
        }

    // Bubble Sort algorithm to sort an array in ascending order
    public static void bubbleSort(int[] array) {
        int num = array.length;

        // Traverse through all elements of the array
        for (int i = 0; i < num - 1; i++) {

            // Last i elements are already sorted, so we skip them
            for (int j = 0; j < num - i - 1; j++) {

                // Swap if the element found is greater than the next element
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
