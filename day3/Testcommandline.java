
public class Testcommandline
{

	public static void main(String[] args) 
	{
	
	System.out.println(args[0]);
	System.out.println(args[1]);
	
	int n = Integer.parseInt(args[0]);
	int m = Integer.parseInt(args[1]);
	int sum = n+m;
	System.out.println(sum);
	
	System.out.println(args[0].toUpperCase());
	System.out.println(args[0].length());
		
		
		System.out.println(sum);
		
	}
}
