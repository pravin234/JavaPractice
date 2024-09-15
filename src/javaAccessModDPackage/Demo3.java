package javaAccessModDPackage;

public class Demo3 {

	//req - create non static method with reverseString method name and inside 
	//method write logic for reverse string

	public void reverseString() {

		String a = "selenium";

		// cal length of string
		int length = a.length()-1;

		for(int i = length; i>= 0 ;i-- ) {
			char c  = a.charAt(i);
			//print string chartacter
			System.out.print(c);

		}

	}


	public static void main(String[] args) {
		// create an object of class 
		Demo3 obj = new Demo3();

		// call an reverseString method /function
		obj.reverseString();
	}

}
