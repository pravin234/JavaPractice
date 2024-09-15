package javaAccessModDPackage;

public class Demo7 {

	public void reverseString() {

		String a = "selenium";

		// calculte length of string
		int length = a.length()-1;

		for(int i = length; i>= 0 ;i-- ) {
			char c  = a.charAt(i);
			//print string chartacter
			System.out.print(c);

		}
		
		
	}

	public void findMaxValue() {

		int abc [] = { 100 , 203,404,45,4546};

		int max = abc[0];

		for(int i = 0; i <= abc.length-1;i++ ) {

			if(abc[i] > max) {
				max = abc[i];
			}

		}
		System.out.println();

		System.out.println("max value is " + max );

	}

	public void findMinValue() {
		int abc [] = { 100 , 203,404,45,4546};

		int min = abc[0];

		for(int i = 0; i <= abc.length-1;i++ ) {

			if(abc[i] < min) {
				min = abc[i];
			}

		}

		System.out.println("minimum value is " + min );

	}

	public static void main(String[] args) {

		// create an obj of class
		Demo7 obj = new Demo7();

		//here calling an nonstatic function or method using object instance varible 

		obj.reverseString();

		obj.findMaxValue();

		obj.findMinValue();


	}

}
