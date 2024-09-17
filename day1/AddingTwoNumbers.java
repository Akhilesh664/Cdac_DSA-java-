package day1;

import java.util.Scanner;

public class AddingTwoNumbers 
{

	public static void main(String[] args) 
	{
		//read integer
		//read string
		
	     int a=0;
	     int b=0; 
	     int total=0;
	    
	     Scanner s = new Scanner(System.in);
	     System.out.println("enter the value of a and b");
			a=s.nextInt();
			b=s.nextInt();
	    
	     total=a+b;
	     System.out.println("sum of a and b is " + total);
	    
		
	}
}
