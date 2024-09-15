package InterviewPackage;

public class StringDemo {

	//Here pass 2 paramter pass
	public static String removeChar(String str, char ch) {
		// Using StringBuilder for efficient string manipulation
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			//Here check character not match then append to string
			if (str.charAt(i) != ch) {
				
				result.append(str.charAt(i));

				
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {


		String inputString = "i Love my india!";
		char charToRemove = 'i';

		// Remove the specified character from the string
		String outputString = removeChar(inputString, charToRemove);


		System.out.println("Original or Input String " + inputString);
		System.out.println("String after removing '" + charToRemove + "': " + outputString);

	}

}
