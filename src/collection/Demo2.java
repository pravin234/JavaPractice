package collection;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {

		ArrayList abc = new ArrayList();
		abc.add(100);
		abc.add('B');
		abc.add("Selenium");
		abc.add(true);
		abc.add(null);
		abc.add(null);
		abc.add('B');

		System.out.println(abc.size()); // 7
		System.out.println(abc.isEmpty()); // false

		System.out.println(abc.get(2)); // Selenium
		System.out.println(abc); // [100, B, Selenium, true, null, null, B]

		System.out.println(abc); // 7
		abc.add(2, 3); //index position ,element element to be inserted
		
		System.out.println(abc.size()); // 7
		System.out.println(abc); // 7

		//ot

	}

}
