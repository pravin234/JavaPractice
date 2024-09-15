package NonStaticReturnTypePackage;

public class Demo2 {
	//create Non static method with String return type and 0 args
	// write logic to return reverse the String

	public static void main(String[] args) {

		//create an obj Demo2 class
		Demo2 obj = new Demo2();

		String xyz = obj.reverseString();

		if(xyz.equals("madam"))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}


	}

	public String reverseString() {
		String input ="madam";
		//reverse logic

		//cal length of input string

		int len = input.length()-1;
		String rev ="";
		for(int i=len ;i >= 0 ;i--) {

			rev = rev + input.charAt(i);

		}
		return rev;



	}

}
