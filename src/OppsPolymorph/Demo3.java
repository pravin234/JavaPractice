package OppsPolymorph;

public class Demo3 {
	
	public void display()
	{
		System.out.println("Non Static Method with 0 args");
	}
	
	public void display(int a)
	{
		System.out.println("Non Static Method with 1 int args");
	}
	
	public void display(char a)
	{
		System.out.println("Non Static Method with 1 char args "+a);
	}
	
	public void display(int a, char b)
	{
		System.out.println("Non Static Method with 1 int and 1 char args "+(a+b));
	}
	
	public void display(char a, int b)
	{
		System.out.println("Non Static Method with 1 char and 1 int args "+(a+b));
	}
	
	
	public static void main(String[] args) {
		Demo3 obj =new Demo3();
		obj.display('a', 10);
		obj.display();
		obj.display(1000);
		obj.display(100, 'P');
		obj.display('S');
		
	}



}
