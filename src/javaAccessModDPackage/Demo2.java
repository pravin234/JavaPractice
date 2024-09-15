package javaAccessModDPackage;

public class Demo2 {

	public  void abc() {
		System.out.println("abc method");
		
	}
	public static void main(String[] args) {
		System.out.println("main method is started");
		
		Demo2 obj = new Demo2();
		
		obj.abc();
		System.out.println("main method is ended");

	}

}
