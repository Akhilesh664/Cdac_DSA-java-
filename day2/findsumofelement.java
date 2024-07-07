import java.util.Scanner;

public class findsumofelement
{

	public static int add(int[] mark)
	{
		
		System.out.println("inside the add method");
		
		int total = 0;
		
		for(int i = 0;i<mark.length;i++)
		{

		total = total + mark[i];
		
		}
		
		//System.out.println(total);
		
		return total;
		
	}
	
	
	public static void main(String[] args) 
	{
		int[] mark = new int[5];

		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<mark.length;i++)
		{
               mark[i]=s.nextInt();
               	

		}
		
		int total=add(mark);
		
		System.out.println("inside the main");
		System.out.println(total);
//		for(int i = 0;i<mark.length;i++)
//		{
//               System.out.println(mark[i]);
//               	
//
//		}
		
		
		
	}
	
}
