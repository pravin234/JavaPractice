 package ArrayDemo;

 import java.util.Arrays;

 public class CombineArrays {
     public static void main(String[] args) {
         int[] array1 = {1, 2, 3};
         int[] array2 = {4, 5, 6};

         int[] combinedArray = Arrays.copyOf(array1, array1.length + array2.length);
         System.arraycopy(array2, 0, combinedArray, array1.length, array2.length);

         // Print the combined array
         for (int num : combinedArray) {
             System.out.print(num + " ");
         }
     }
 }
