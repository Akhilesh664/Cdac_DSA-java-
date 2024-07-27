//2
package day13;

public class Exception2 
{

	public static void main(String[] args) {
		
		int[] mark = {10,20,30,40};
		String cname = "cdac";
		
		try
		{
			
	     //cname = null;
	     
	    System.out.println(cname.length());
	     
		System.out.println(mark[3]);
		
		int a =20;
		int b = 0;
		
		int c = a/b;
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("given index is not valid");
		}
		catch(NullPointerException e)
		{
		   System.out.println("object not exist");	
		   System.out.println(e);
		}catch(Exception e)
		{
			System.out.println("Aritmetic Exception");
		}
		
		
		
		System.out.println("rest of the code");
	}
}
