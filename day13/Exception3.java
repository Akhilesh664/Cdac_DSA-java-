// 3
package day13;

public class Exception3
{
	
	public  static void eligibleforvote(int age)  
	{
		try
		{
		if(age<18)
			{
				throw new EligibleException("not eligible for vote");
				
			}
			else
			{
				System.out.println("eligible for vote");
			}
		}
		catch(EligibleException e)
		{
			System.out.println(e.getMessage());
		}
			
		
	}
	
	
	public static void main(String[] args) 
	{

	int age=1;
	
	eligibleforvote(age);
	
	
	
	
}


}
