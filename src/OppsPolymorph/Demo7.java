package OppsPolymorph;

public class Demo7 {
	// can we achieve the method overloading for final NON STATIC method
		final public void display() {
			System.out.println("Final NON Static Method with 0 args");
		}

		final public void display(int a) {
			System.out.println("Final NON Static Method with 1 int args " + a);
		}

		final public void display(String a) {
			System.out.println("Final NON Static Method with 1 String args " + a);
		}

		final public void display(int a, String b) {
			System.out.println("Final NON Static Method with 1 int and 1 String args " + a + b);
		}

		final public void display(String a, int b) {
			System.out.println("Final NON Static Method with 1 String and 1 int args " + a + b);
		}

		public static void main(String[] args) {
			Demo7 obj = new Demo7();
			obj.display();
			obj.display(100);
			obj.display("POM");
			obj.display(100, "Version Control System tool");
			obj.display("GitHub", 90900);

		}

}
