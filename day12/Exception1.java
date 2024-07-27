// @4 EXCEPTION

package day12;

public class Exception1 
{

	public static void main(String[] args) 
	{
	
		int a = 20;
		int b = 0;
		try
		{
		int c = a/b;
		System.out.println(c);
		}catch(ArithmeticException e)
		{
		    System.out.println(e.getMessage());
			System.out.println("divide by zero error");
		}
				
		
		System.out.println("rest of the code");
		
	}
	
}
