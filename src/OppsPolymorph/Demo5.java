package OppsPolymorph;

public class Demo5 {

	private void xyz() {
		System.out.println("Private NON Static Method with 0 args");
	}

	private void xyz(String a) {
		System.out.println("Private NON Static Method with 1 String args " + a);
	}

	private void xyz(char a) {
		System.out.println("Private NON Static Method with 1 char args " + a);
	}

	private void xyz(String a, char b) {
		System.out.println("Private NON Static Method with 1 String and 1 char args " + a + " " + b);
	}

	private void xyz(char a, String b) {
		System.out.println("Private NON Static Method with 1 char and 1 String args " + a + " " + b);
	}

	public static void main(String[] args) {
		Demo5 obj = new Demo5();
		obj.xyz();
		obj.xyz('P');
		obj.xyz("Hamcrest Framework");
		obj.xyz('M', "JsonPath");
		obj.xyz("JDBC", 'P');
	}


}
