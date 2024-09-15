package OppsPolymorph;

public class Demo4 {

	// can we achieve the method overloading for private static method
		private static void xyz() {
			System.out.println("Private Static Method with 0 args");
		}

		private static void xyz(String a) {
			System.out.println("Private Static Method with 1 String args " + a);
		}

		private static void xyz(char a) {
			System.out.println("Private Static Method with 1 char args " + a);
		}

		private static void xyz(String a, char b) {
			System.out.println("Private Static Method with 1 String and 1 char args " + a + " " + b);
		}

		private static void xyz(char a, String b) {
			System.out.println("Private Static Method with 1 char and 1 String args " + a + " " + b);
		}

		public static void main(String[] args) 
		{
			Demo4.xyz();
			Demo4.xyz('A');
			Demo4.xyz("Jenkins");
			Demo4.xyz('A', "Rest Assured");
			Demo4.xyz("Hamcrest Framework", 'A');
		}



}
