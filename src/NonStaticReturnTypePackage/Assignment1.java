package NonStaticReturnTypePackage;

public class Assignment1 {

	//	Ass:
	//		declare the int variable
	//						int a=1;
	//		conditions
	//				i) if a number is between 1 to 100 then print a small number
	//				ii) if a number is between 101 to 1000 then print a number is medium
	//				iii) if a numbers is between 1001 to 10000 the print a number is large
	//				iv) if a number is above 10001 then a number is biggest number
	//				v) if a number is below 1 then a number is zero or negative number.


	public String  checkNumber(int a ) {
		String abc ="";
		if(a<0 && a>=100) {
			abc ="a small number";

		}
		else if(a>100 && a<= 1000 ){
			abc ="a small medium";
		} 
		else if( a>1000 && a<= 10000){
			abc = "a is large" ;

		}
		else if( a>1000 && a<= 10000){
			abc = "a is biggest number" ;

		}
		else if( a<=0){
			abc = "a is zero or negative number" ;

		}
		return abc;

	}

	public static void main(String[] args) {

		Assignment1 obj = new Assignment1 ();

		String check = obj.checkNumber(300);
		System.out.println(check);


	}

}
