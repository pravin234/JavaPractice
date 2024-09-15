package Demo;

public class OperaterDemo {

	public static void main(String[] args) {
		// Operator in Java
		// 1) Arithmetic operator
		// 2) Relational Operator
		// 3) Logical Operator
		// 4) Assignment Operator

		// Arithmetic operators
		int a = 10, b = 20;
		System.out.println("Arithmetic operator addition: " + (a + b));
		System.out.println("Arithmetic operator subtraction: " + (a - b));
		System.out.println("Arithmetic operator multiplication: " + (a * b));
		System.out.println("Arithmetic operator division: " + (a / b));
		System.out.println("Arithmetic operator modulus: " + (a % b));
		System.out.println("Arithmetic operator increment: " + (a++));
		System.out.println("Arithmetic operator decrement: " + (b--));

		// Relational Operator
		// i) equal to ==
		// ii) not equal to !=
		// iii) greater than >
		// iv) greater than or equal to >=
		// v) less than <
		// vi) less than or equal to <=
		int c = 10;
		System.out.println("Relational operator equal to: " + (a == b)); // false
		System.out.println("Relational operator equal to: " + (a == c)); // true
		System.out.println("Relational operator not equal to: " + (a != b)); // false
		System.out.println("Relational operator greater than: " + (b > a)); // true
		System.out.println("Relational operator less than: " + (a < b)); // true
		System.out.println("Relational operator greater than or equal to: " + (b >= a)); // true
		System.out.println("Relational operator less than or equal to: " + (a <= b)); // true



		// Logical Operator
		//	        AND Operator
		//	        Condition1   Condition 2    Result
		//	        true          true          true
		//	        true          false         false
		//	        false         true          false
		//	        false         false         false
		//	        
		//	        AND Operator
		//	        Condition1   Condition 2    Result
		//	        true          true          true
		//	        true          false         true
		//	        false         true          true
		//	        false         false         false
		//	        
		//	        NOT Operator
		//	        Condition1    Result
		//	        true          false
		//	        false         true 


		int x = 100, y = 200, z = 300;
		System.out.println("Logical AND &&: " + ((x < y) && (y < z)));
		System.out.println("Logical OR ||: " + ((x < y) || (y < z)));
		System.out.println("Logical NOT !: " + (!(x > y)));

		// Assignment Operator
		// i) assignment =
		// ii) add and Assign +=
		// iii) sub and Assign -=
		// iv) div and assign /=
		// v) mul and assign *=
		// vi) module and assign %=
		int m = 120;
		m += 10;
		System.out.println("Assignment using equal symbol: int m = 120; " + m);
		System.out.println("Add and Assign operator: int m = 120; " + (m += 10));
		System.out.println("Subtract and Assign operator: int m -= 10; " + (m -= 10));
		System.out.println("Divide and Assign operator: int m /= 10; " + (m /= 10));
		System.out.println("Multiply and Assign operator: int m *= 10; " + (m *= 10));
	}
}