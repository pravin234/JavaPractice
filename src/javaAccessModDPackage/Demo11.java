package javaAccessModDPackage;

public class Demo11 {
	//create nonstatic method with 3 argument and write logic find max value 
	
	
	public void maxValue(int a,int b, int c) {
	
		if((a > b) && (a> c)) {
			
			System.out.println("Max value is A " +a );
		}
		else if(b>c){
			System.out.println("Max value is B " +b );
		}
		else {
			System.out.println("Max value is C " +c );
		}
	}

	public static void main(String[] args) {
		// cretae an obj of class
		
		Demo11 obj = new Demo11();
		
		// calling an functions with pass an argument
		
		obj.maxValue(123, 456, 150);
		
		obj.maxValue(10, 20, 30);
		

	}

}
