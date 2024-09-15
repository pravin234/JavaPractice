package Pattern;

import java.util.Scanner;

public class RightTrangle {    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // user to enter the number of rows
        System.out.print("Enter the number of rows for the right triangle: ");
        int rows = scanner.nextInt();
        
        // Close the scanner
        scanner.close();
        
        // logic the right triangle star pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
