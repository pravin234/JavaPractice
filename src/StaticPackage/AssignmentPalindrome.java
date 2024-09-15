package StaticPackage;

public class AssignmentPalindrome {

	public static void Palindrome(String input) {
		
		String reverse = "";
		for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
 		System.out.println("reverse sting is " +reverse); 
        if (input.equals(reverse)) {
            System.out.println("The string " + input +  " is a palindrome.");
        } else {
            System.out.println("The string  " + input + " is not a palindrome.");
        }
		
	}
	public static void main(String[] args) {
		
        String[] testStrings = {"madam", "Naman", "Pravin", "Welearn Static method"};

        for (String testString : testStrings) {
            Palindrome(testString.replaceAll("\\s+", "").toLowerCase());
        }


	}

}
