package StaticPackage;

public class Assignment1 {


	public static void splitString(String input) {

		if (input == null || input.isEmpty()) {
			System.out.println("Input string is null or empty.");
			return;
		}

		// Extract numbers

		String num =input.replaceAll("[^0-9]", "");
		System.out.println("String number occurance  "+num);
		// Extract capital Ltter
		String upperCase =input.replaceAll("[^A-Z]", "");
		System.out.println("String Capiatl ALphabet/charcter occurance  "+upperCase + " legth is " +upperCase.length());

		// Extract numbers
		String lowerCase =input.replaceAll("[^a-z]", "");
		System.out.println("String contain lowercase  occurance  "+lowerCase + " legth is " +lowerCase.length() );

		// Extract numbers 
		String specialChar = input.replaceAll("[a-zA-Z0-9]","");
		System.out.println("String contain specail charchter occurance  " +specialChar  + " legth is " +specialChar.length() );
		
		//combine the upper case letter and lower case letter
		String combineString = upperCase.concat(lowerCase);
		System.out.println(combineString);
		// another way combine 
		int totalLength = upperCase.length() +  lowerCase.length();
	
		for(int i=0; i>lowerCase.length()-1;i++ ) {
			
			 upperCase += lowerCase.charAt(i);
		}
		
		System.out.println(upperCase);
		
		
		
		
		
	
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1.splitString("%^&PRAVIN23041992kadam*&*");

	}

}

