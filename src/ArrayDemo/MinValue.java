package ArrayDemo;

public class MinValue {
	

	public static void main(String[] args) {

		int[] abc = new int[6];
		abc[0] = 1000;
		abc[1] = 1200;
		abc[2] = 300;
		abc[3] = 1400;
		abc[4] = 500;
		abc[5] = 550;
		
		int size = abc.length;
		int max= abc[0];
		for(int i=0;i<=size -1;i++)
		{
			if(abc[i]>max)
			{
				max=abc[i];//1400
			}
		}
		System.out.println(max);

	}
}
