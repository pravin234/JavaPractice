package ArrayDemo;

import java.util.Arrays;

public class ArrayMethodsDemo {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 3};
        
        // 1. Arrays.toString() - Convert array to string for printing
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // 2. Arrays.sort() - Sort the array
        
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // 3. Arrays.binarySearch() - Search for an element in the sorted array
        int key = 7;
        int index = Arrays.binarySearch(numbers, key);
        if (index >= 0) {
            System.out.println(key + " found at index " + index);
        } else {
            System.out.println(key + " not found in the array");
        }

        // 4. Arrays.copyOf() - Copy elements of the array to a new array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // 5. Arrays.fill() - Fill the entire array with a specified value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));

        // 6. Arrays.equals() - Compare two arrays for equality
        int[] numbers2 = {5, 2, 9, 1, 7, 3};
        boolean isEqual = Arrays.equals(numbers, numbers2);
        System.out.println("Are arrays equal? " + isEqual);

        // 7. Arrays.copyOfRange() - Copy a range of elements from the array to a new array
        int[] rangeArray = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Copied Range Array: " + Arrays.toString(rangeArray));
        
        //8  how to new element in existing array
        
        char[] inputArray = {'a', 'b', 'c'};
       
        char[] newArray = Arrays.copyOf(inputArray, inputArray.length + 1);
        newArray[inputArray.length] = 'd';
        
           System.out.println(Arrays.toString(newArray));
           
           //9 add new element in array 
           int[] inputArray1 = {1, 2, 3, 4, 5};

           // Copy the original array to a new array with one additional element
           int[] newArray1 = Arrays.copyOf(inputArray1, inputArray1.length + 1);

           // Add element '6' at the end of the new array
           newArray1[inputArray1.length] = 6; // Note: '6' is an integer, not a character

           // Print the new array
           System.out.println(Arrays.toString(newArray1));
        

    }
}