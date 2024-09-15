package NonStaticReturnTypePackage;

public class Demo4 {

	//create non static method with String return and String arguments
	// write logic to reverse the String and return the reverse String

	public String reverseString(String a)
	{
		String rev="";
		int b = a.length()-1;

		for(int i=b;i>=0;i--)
		{
			char c = a.charAt(i);
			rev= rev+c;
		}

		return rev;	
	}



	public static void main(String[] args) {

		Demo4 obj =new Demo4();

		String xyz = obj.reverseString("madam");

		if(xyz.equals("madam"))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}



	}

}
