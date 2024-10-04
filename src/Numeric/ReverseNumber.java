package Numeric;

public class ReverseNumber {

	public static void main(String[] args) {
		String str = "123";

		int len = str.length() - 1;
		System.out.println(len);

		for (int i = len; i >= 0; i--) {
			char num = str.charAt(i);
			System.out.print(num);
		}
	}

}
