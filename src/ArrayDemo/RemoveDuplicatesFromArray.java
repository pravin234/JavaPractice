package ArrayDemo;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};

        // Sort the array to group duplicate elements together
        Arrays.sort(inputArray);

        // Create a new array to store unique elements
        int[] uniqueArray = new int[inputArray.length];
        int previous = inputArray[0];
        uniqueArray[0] = previous;

        // Loop through the sorted array to find and store unique elements
        int j = 1;
        for (int i = 1; i < inputArray.length; i++) {
            int current = inputArray[i];
            if (current != previous) {
                uniqueArray[j] = current;
                j++;
            }
            previous = current;
        }

        // Create a copy of the unique elements array with correct size
        int[] finalArray = Arrays.copyOf(uniqueArray, j);

        // Print the array without duplicates
        System.out.println("Array with duplicates: " + Arrays.toString(inputArray));
        System.out.println("Array without duplicates: " + Arrays.toString(finalArray));
    }
}
