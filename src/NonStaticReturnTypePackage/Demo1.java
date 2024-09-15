package NonStaticReturnTypePackage;

public class Demo1 {
	
	public static void main(String[] args) {
		
		Demo1 obj = new  Demo1();
		int b = obj.findMax();
		
		System.out.println("Max value is "+ b);
		
		
	}
	
	public int findMax() {
		
		int [] arr = {100,20000,300,40,500,7000};
		int max = arr[0];
		
		for(int i = 0; i<= arr.length -1; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
		
	}

}
