package OppsPolymorph;

public class Demo2 {

	public static void abc() {
		System.out.println("abc static Method with 0 args");
	}

	public static void abc(int a) 
	{
		System.out.println("abc static Method with 1 int args "+a);
	}

	public static void abc(String a) 
	{
		System.out.println("abc static Method with 1 String args "+ a);
	}

	public static void abc(int a, String b) 
	{
		System.out.println("abc static Method with 1 int and 1 String args "+a +" "+b);
	}

	public static void abc(String a, int b) {
		System.out.println("abc static Method with 1 String and 1 int args "+a +" "+b);
	}

	public static void main(String[] args) {
		Demo2.abc(10, "cucumber");
		Demo2.abc("Selenium");
		Demo2.abc();
		Demo2.abc(1000);
		Demo2.abc("TestNG", 9090);
	}

}
