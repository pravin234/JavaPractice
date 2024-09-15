package Demo;
import java.util.Arrays;
public class SortArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] strings = {"apple", "banana", "orange", "grape", "kiwi", "pineapple"};

	        // Sort the array
	        Arrays.sort(strings);

	        // Print the sorted array
	        System.out.println("Sorted array:");
	        for (String str : strings) {
	            System.out.print(str + " ");
	        }

		
	}

}
