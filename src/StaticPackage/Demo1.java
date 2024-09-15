package StaticPackage;


public class Demo1 {


	public static void findULR(String xyz)
	{

		//find upper case
		String uppercase=xyz.replaceAll("[^A-Z]","");
		System.out.println(uppercase);

		//find lower case
		String lowercase=xyz.replaceAll("[^a-z]","");
		System.out.println(lowercase);

		//combine the upper case letter and lower case letter
		String combinestring = uppercase.concat(lowercase);

		// reverse the combined string
		int len = combinestring.length()- 1;

		String rev = "";

		for (int i = len; i >= 0; i--)
		{
			rev = rev + combinestring.charAt(i);
		}
		System.out.println(rev);
	}


	public static void main(String[] args) {
		Demo1.findULR("%^&ABOLI01022022shinde*&*");
	}


}