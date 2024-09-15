package javaAccessModDPackage;

public class Demo10 {
	
	// nonstatic method without return type and 1 string arguments

	public void abc(String a) {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		//create an object of class
		Demo10 obj = new Demo10();
		
		System.out.println("Main method  is started ");
		//call the functionwith pass parameter /arguments
		
		obj.abc("selenium");
		
		obj.abc("selenium");
		
		obj.abc("cucumber");
		
		System.out.println("Main method  is ended ");
		
	}

}
