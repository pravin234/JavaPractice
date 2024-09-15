package StaticPackage;

public class MaxValue {

    // Create a static method to find the max value from an array.
    // It returns an int and takes no arguments.
    public static int findMaxValue() {
        int[] xyz = {100, 200, 300, 4500, 34, 456};
        
        // Initialize max with the first element of the array
        int max = xyz[0];
        
        // Iterate through the array to find the maximum value
        for (int i = 1; i < xyz.length; i++) {
            if (xyz[i] > max) {
                max = xyz[i];
            }
        }
        return max;
    }
    
    public static void main(String[] Args) {
        // 1) Direct function call
        int a = findMaxValue();
        System.out.println("Direct function call: " + a);
        
        // 2) Class name and method name
        int result = MaxValue.findMaxValue();
        System.out.println("Class name and method name: " + result);
        
        // 3) Create a class object and use the object to call the method
        MaxValue obj = new MaxValue();
        int result1 = obj.findMaxValue();
        System.out.println("Using object to call the method: " + result1);
    }
}
