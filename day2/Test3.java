import java.util.Scanner;

public class Test3 
{

	public static void main(String[] args) 
	{
	
		System.out.println("enter the value");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		String  str =s.next();
		char op = str.charAt(0);
		
		switch(op)
		{
		
		case '+' : System.out.println(a+b);
		break;
		case '-' : System.out.println(a-b);
		break;
		case '*' : System.out.println(a*b);
		break;
		case '/' : System.out.println(a/b);
		
		
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
