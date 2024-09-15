package Pattern;

public class MaXMin {
	public static void main(String[] args) {
		
		//find max salary 
		
		int[] salary = {10,20,30,13,41,19,18};
		
		  int max = salary[0];
	        int min = salary[0];
		 for(int i=0; i<=salary.length-1;i++) {
			 if (salary[i] > max) {
	                max = salary[i];
	            }
	            if (salary[i] < min) {
	                min = salary[i];
	            }
			 
		 }
		 System.out.println("max salary is "+ max);
		 System.out.println("min salary is " +min);
		
	}

}
