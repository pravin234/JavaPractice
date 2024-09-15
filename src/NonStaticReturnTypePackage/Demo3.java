package NonStaticReturnTypePackage;

public class Demo3 {

	//non static method with return type and multiple arguments

	public int findMaxValue() {
		int [] abc = {100,2032,404,45,54545};

		int max = abc[0];

		for(int i=0;i<abc.length;i++)
		{
			if(abc[i]>max)
			{
				max= abc[i];
			}
		}

		return max;
	}
	public static void main(String[] args) {
		System.out.println("Main method is started");

		Demo3 obj = new Demo3();

		int b = obj.findMaxValue();

		System.out.println(b);

		System.out.println("Main method is ended");



	}

}
