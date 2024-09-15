package Demo;

public class CondtionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		type condtionl statement in java
		//		if, if-else, and switch
		int a =12;
		if(a >= 10) {
			System.out.println("a is less than 10");
		}

		int y = -5;
		if (y > 0) {
			System.out.println("y is positive");
		} else {
			System.out.println("y is non-positive");
		}

		int z = 20;
		if (z > 0) {
			if (z % 2 == 0) {
				System.out.println("z is positive and even");
			} else {
				System.out.println("z is positive and odd");
			}
		} else {
			System.out.println("z is non-positive");
		}

//		Hint age = 20;
//		if(age>18) {
//			System.out.println("You are new voter for election 2024");
//		}
//		else {
//			System.out.println("your age less than 18 ");
//		}
		
		//if else using  2 condition check grater than

		int a1=100,b1=800,c1=8000;

		if((a1>b1)&&(a1>c1))
		{
			System.out.println("A is bigger than B and C");
		}
		else if(b1>c1)
		{
			System.out.println("B is bigger than A and C");
		}
		else
		{
			System.out.println("C is bigger than A and B");
		}

		//statement - 
//		if age is between 0 to 11 then print child keyword
//		if age is between 12 to 17 then print teen keyword
//		if age is between 18 to 64 print adult keyword
//		if age is above 64 the print senior keyword
		
		int age = 78;
		if((age>=0)&& (age<= 11)) {
		System.out.println("you are child");	
		}
		else if((age>=12)&& (age<= 17)) {
			System.out.println("you are teen age");	
			}
		else if((age>=18)&& (age<= 64)) {
			System.out.println("you are adlut");	
		}
		else {
			System.out.println("you are senior person");
		}
		

		String dayString = "2"; // Note: dayString should be a String

		switch(dayString) {
		case "1":
			dayString = "Sunday";
			break;
		case "2":
			dayString = "Monday";
			break;
		case "3":
			dayString = "Tuesday";
			break;
		case "4":
			dayString = "Wednesday";
			break;
		case "5":
			dayString = "Thursday"; // Fixed the spelling of Thursday
			break;
		case "6":
			dayString = "Friday";
			break;
		case "7":
			dayString = "Saturday";
			break;
		default:
			dayString = "Invalid day";
		}

		System.out.println(dayString);
		
	}

}
