
public class ArrayExample
{

	public static void main(String[] args) 
	{
		int[] mark = new int[5];

		mark[0]= 10;
		mark[1]= 20;
		mark[2]= 30;
		mark[3]= 40;
		mark[4]= 50;
		
		int total=0;
		for(int i = 0;i<mark.length;i++)
		{

		System.out.println(mark[i]);
		total = total +mark[i];

		}
       System.out.println(total);
		
      
		
		String[] s = new String[3];
		s[0]= "c++";
		s[1]= "java";
		s[2]= "dbt";
		
		
		for(int i = 0;i<s.length;i++)
		{

		System.out.println(s[i]);
		
		}
		
		
	String[] sub = {"c++","python",".net"};	
		
		//iterate using for each
	System.out.println("using for each");
	
	for(String str :sub   )
	{
		System.out.println(str);
	}
	
       
       
		
	}
}
