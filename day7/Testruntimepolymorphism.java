// 5

package day7;
import java.util.Scanner;

class Bank
{
	public void payment()
	{
		System.out.println("payment made");
	}
}


class Icici extends Bank
{
	
	public void payment()
	{
		System.out.println("payment made using Icici");
	}
	
}

class Sbi extends Bank
{
	
	public void payment()
	{
		System.out.println("payment made using Sbi");
	}
	
}

class Axis extends Bank
{
	
	public void payment()
	{
		System.out.println("payment made using Axis");
	}
	
}


public class Testruntimepolymorphism 
{	
	private static Bank createbankobject(String bname) 
	{
		    if(bname.equals("Sbi"))
		    	return new Sbi();
		    else if(bname.equals("Axis"))
		    	return new Axis();
		    else if(bname.equals("Icici"))
		    	return new Icici();
		    else return null;	
	}
	

	public static void main(String[] args) 
	{
		Bank b;
	    
	    System.out.println("enter the bank to make payment");
	    Scanner s = new Scanner(System.in);
	    String bname = s.next();
	       
		b = createbankobject(bname);
		b.payment();		
		
		
				
		
	}

	
	
	
}
