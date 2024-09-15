package javaAccessModDPackage;

public class Demo14 {

	//cretae non static method without return and 0 arguments
	
	public void abc() {
		System.out.println("abc method");
	}
	
	//cretae non static method without return and 2 int arguments
	
	public void addition(int a,int b ) {
		int c = a +b;
	
		System.out.println("addition of a is  "+a + "and b is " +c );
	}
	
	public void substraction(int a , int b) {
		int c = a -b;
		
		System.out.println("addition of a is  "+a + "and b is " +c );

		
	}
	
	
	public static void main(String[] args) {
		
		Demo14 obj = new Demo14();
		obj.abc();
		obj.addition(10, 20);
		obj.substraction(30, 5);

	}

}
