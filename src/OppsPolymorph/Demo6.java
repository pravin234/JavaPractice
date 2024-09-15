package OppsPolymorph;

public class Demo6 {
	// can we achieve the method overloading for final STATIC method
		final public static void display() {
			System.out.println("Final Static Method with 0 args");
		}

		final public static void display(int a) {
			System.out.println("Final Static Method with 1 int args " + a);
		}

		final public static void display(String a) {
			System.out.println("Final Static Method with 1 String args " + a);
		}

		final public static void display(int a, String b) {
			System.out.println("Final Static Method with 1 int and 1 String args " + a + b);
		}

		final public static void display(String a, int b) {
			System.out.println("Final Static Method with 1 String and 1 int args " + a + b);
		}

		public static void main(String[] args) {
			Demo6.display();
			Demo6.display(100);
			Demo6.display("GitHub");
			Demo6.display(100, "Maven Build tool");
			Demo6.display("POM-Design Pattern to design the OR", 9090);
		}


}
