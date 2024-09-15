package OppsPolymorph;

public class Demo8 {
	
	// can we achieve the method overloading for protected STATIC method
		protected static void display() {
			System.out.println("protected Static Method with 0 args");
		}

		protected static void display(int a) {
			System.out.println("protected Static Method with 1 int args " + a);
		}

		protected static void display(String a) {
			System.out.println("protected Static Method with 1 String args " + a);
		}

		protected static void display(int a, String b) {
			System.out.println("protected Static Method with 1 int and 1 String args " + a + b);
		}

		protected static void display(String a, int b) {
			System.out.println("protected Static Method with 1 String and 1 int args " + a + b);
		}

		public static void main(String[] args) {
			Demo8.display();
			Demo8.display(100);
			Demo8.display("JDBC");
			Demo8.display(100, "BDD Framework");
			Demo8.display("Extent Reports", 100);
		}


}
