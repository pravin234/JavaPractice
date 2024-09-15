package OppsPolymorph;

public class Demo1 {

	public static void abc() {
		System.out.println("abc static method");
	}

	// it store in heap memory location:
	// heap memory will create after running the program means at run time
	public void xyz() {
		System.out.println("xyz non static method");
	}

	public static void main(String[] args) 
	{
		Demo1.abc();

		Demo1 obj1 =new Demo1();
		obj1.xyz();
	}

}
