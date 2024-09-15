package Demo;

public class StringDemo {

	public static void main(String[] args) {

		//string  length	
		String a = "A satisfied life is better than a successful life";
		int b = a.length();
		System.out.println(b);

		//2 toUppercase
		String c = a.toLowerCase();
		System.out.println(c);

		//3 uppercase
		String d = a.toUpperCase();
		System.out.println(d);

		//4 stringwith
		boolean e = a.startsWith("A satisfied");
		System.out.println(e);

		//5 string endwith
		boolean f = a.endsWith("successful life");
		System.out.println(f);

		// 6 contains

		String h = "i love India";

		System.out.println("6 contains " + h.contains("love"));

		// 7 equal

		String i = "pravin";
		String j = "pravin";

		boolean k = j.equals(j);

		System.out.println("equal method o/p" +k);

		// 7 equalsToCase

		String l = "pravin";
		String m = "Pravin";

		boolean n = l.equalsIgnoreCase(m);
		System.out.println("equalsIgnoreCase method  "+n);

       //8 == operator 

       System.out.println("== operator "+  (i==j));

       
       






	}

}
