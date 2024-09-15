package Demo;

public class PyramidDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //pyramid demo eft top  
		for(int i=1;i<=5;i++){  
			for(int j=1;j<=i;j++){  
				System.out.print("* ");  
			}  
			System.out.println();//new line  
		}  
		
		
		System.out.println(" pyaramid top right to decrese slight");
		//
		
		int term=5;  
		for(int i=1;i<=term;i++){  
		for(int j=term;j>=i;j--){  
		        System.out.print("* ");  
		}  
		System.out.println();//new line  
		}  
		
		
		

	}

}
