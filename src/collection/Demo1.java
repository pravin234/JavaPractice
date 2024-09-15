package collection;

import java.util.ArrayList;

public class Demo1 {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList abc =new ArrayList();
		abc.add(100);
		abc.add("Pravin");
		abc.add("Selenium");
		abc.add(true);
		abc.add("Hari");
		abc.add(null);
		abc.add('B');

		System.out.println(abc);
		abc.remove(3);
		System.out.println(abc);
		
		ArrayList pqr = (ArrayList) abc.clone();
		System.out.println(pqr);
	}

}
