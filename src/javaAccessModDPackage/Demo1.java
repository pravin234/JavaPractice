package javaAccessModDPackage;

public class Demo1 {
	
	public void abc() {
		
		System.out.println("abc method");
		
	}


	public static void main(String[] args) {
		
		//create an object of class
		Demo1 obj = new Demo1();
		//call nonstatic method by using object instance name 
		obj.abc();
		
	}
}
