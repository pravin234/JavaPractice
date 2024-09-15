package Demo;
import java.util.Arrays;

public class MaxStringArray {
    public static void main(String[] args) {
        // create an array of strings
        String[] strings = {"apple", "banana", "orange", "grape", "kiwi" ,"pineapple"};

        String maxString = findMaxString(strings);
        
        System.out.println("The maximum string is: " + maxString);
    }
    
    public static String findMaxString(String[] arr) {
        // Sort the array in lexicographical order
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    
}
