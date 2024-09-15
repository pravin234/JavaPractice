package Demo;

public class DatatypeDemo {

    // 1) byte: range -128 to 127 values.
    // 2) short
    // 3) int
    // 4) long
    // 5) float
    // 6) double
    // 7) boolean
    // 8) char

    public static void main(String[] args) {

        // Example of byte
        byte byteData = 120; // Range: -128 to 127
        System.out.println("Example of byte: " + byteData);

        // Example of short
        short shortData = 12000; // Range: -32,768 to 32,767
        System.out.println("Example of short: " + shortData);

        // Example of int
        int intData = 1820; // Range: -2,147,483,648 to 2,147,483,647
        System.out.println("Example of int: " + intData);

        // Example of long
        long longData = 120L; // Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println("Example of long: " + longData);

        // Example of double
        double doubleData = 120.5; // Represents floating point numbers with double precision
        System.out.println("Example of double: " + doubleData);
        
        float flaotData = 190.55f;

        System.out.println("Example of flaotData: " + flaotData);
        
  
        // Example of boolean
        boolean booleanData = 12 > 10; // Can only be true or false
        System.out.println("Example of boolean: " + booleanData);

        // Example of char
        char charData = 'A'; // Represents a single 16-bit Unicode character
        System.out.println("Example of char: " + charData);
    }
}
