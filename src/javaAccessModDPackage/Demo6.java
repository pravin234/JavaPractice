package javaAccessModDPackage;

public class Demo6 {

	// create 3 non static method
	
	public void abc() {

		System.out.println("abc method in Demo6 class ");
	}

	public void xyz() {
		System.out.println("xyz method in Demo6 class");
	}

	public void pqr() {
		System.out.println("pqr method in Demo6 class");

	}
	
	public static void main(String[] args) {

		// create obj of Demo6 class
		Demo6 obj = new Demo6();
		System.out.println("main method is started");
		
		obj.abc();
		obj.xyz();
		obj.pqr();
		
		System.out.println("mian method is ended");

	}

}
