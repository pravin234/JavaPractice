package Pattern;

public class secondmax {
	
	public static int second(int[] arr) {
	    int highest = arr[0];
	    int second = 0;
	    for (int i = 1; i < arr.length; i++) {
	        int j = arr[i];
	        if (j >= highest) {
	            highest = j;
	        } else if (j > second) {
	            second = j;
	        }
	    }
	    return second;
	}

	public static void main(String[] args) {
	    int[] arr = {1, 3, 2, 5, 3};
	    int result = second(arr);
	    System.out.println(result);
	}

}
