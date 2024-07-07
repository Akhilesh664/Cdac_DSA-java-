
public class Test1
{

	public static void increment(int a)// here making static functions for increment
	{
		++a;
		System.out.println(a);
		
	}
	public static void main(String[] args) 
	{
	
		int a = 10;
		System.out.println(a);
		increment(a);
		System.out.println(a);
	}

}
