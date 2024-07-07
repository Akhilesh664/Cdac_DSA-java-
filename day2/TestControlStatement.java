import java.util.Scanner;

public class TestControlStatement 
{
	
	public static String findOddEven(int num)
	{
		  String result;
		
		if(num%2 == 0)
		{
			result = "even";
		}else
			result = "odd";
		
		return result;
	}
	
	
	

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
	    
		int num=s.nextInt();
		
		String result=findOddEven(num);
		System.out.println(result);
		System.out.println("inside the main");
			
	}
	
}
