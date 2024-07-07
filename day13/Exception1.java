// 2
import java.util.Scanner;

public class Exception1
{
	private static void findresult() 
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a ,b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try
		{
		int c = a/b;
		System.out.println(c);
		}catch(ArithmeticException e)
		{
			System.out.println("value of b should not be zero");
		}
	
	}
	
	
	public static void main(String[] args) 
	{
	
		
		findresult();
		
		
		System.out.println("rest of the code in main");

	
	}

}
