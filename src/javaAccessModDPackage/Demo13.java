package javaAccessModDPackage;

public class Demo13 {
	
	// Create non static method with string arguments and write logic reverstring
	
	public void reverseString(String input) {

		

		// cal length of string
		int length = input.length()-1;

		for(int i = length; i>= 0 ;i-- ) {
			char c  = input.charAt(i);
			//print string chartacter
			System.out.print(c);

		}
		System.out.println();

	}

	public static void main(String[] args) {
	
		Demo13 obj = new Demo13();
		
		//
		obj.reverseString("james gosling");
		
		

	}

}
