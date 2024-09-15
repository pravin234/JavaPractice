package InterviewPackage;

import java.util.Arrays;

public class EvenOddArrayDemo {

    public static void main(String[] args) {
        //  input array
        int[] input = {3, 8, 12, 5, 10, 6, 7};
        
        // Call the function to separate even and odd numbers
        int[][] result = separateEvenOdd(input);
        
        System.out.println("Even Numbers: " + Arrays.toString(result[0]));
        System.out.println("Odd Numbers: " + Arrays.toString(result[1]));
    }

    public static int[][] separateEvenOdd(int[] input) {
        // Step 1: Count the number of even and odd elements
        int evenCount = 0;
        int oddCount = 0;

        for (int num : input) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Step 2: Create arrays for even and odd numbers
        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];

        // Step 3: Populate the even and odd arrays
        int evenIndex = 0;
        int oddIndex = 0;

        for (int num : input) {
            if (num % 2 == 0) {
                evenArray[evenIndex++] = num;
            } else {
                oddArray[oddIndex++] = num;
            }
        }
        return new int[][]{evenArray, oddArray};
    }
}

