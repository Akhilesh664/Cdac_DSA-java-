//@2 Array-List

import java.util.ArrayList;
import java.util.Scanner;

public class Empmanagement 
{

	public static ArrayList<Emp> addemp() 
	{
		Emp e1 = new Emp(1001,"shan",30000);
		Emp e2 = new Emp(1002,"raj",40000);
		Emp e3 = new Emp(1003,"siju",50000);
		
		ArrayList<Emp> al = new ArrayList<>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		return al;
		
	}

	public static void dispemp(ArrayList<Emp> al)
	{
		for(Emp e :al)
		{
		  e.dispEmp();
		}
		
	}

	public static void deleemp(ArrayList<Emp> al) 
	{
		System.out.println("enter the empno to delete");
		Scanner s = new Scanner(System.in);
		
		int no = s.nextInt();
		int pos=0;
		for(Emp e :al)
		{
		  if(e.empno ==no)
		  {
			   pos=al.indexOf(e);
		  }
				
		}
		al.remove(pos);
		
	}

	public static void updateemp(ArrayList<Emp> al) 
	{
		System.out.println("enter the amount to add for perticuler empno");
		Scanner s = new Scanner(System.in);
		int amt= s.nextInt();
		int n = s.nextInt();
		
		for(Emp e :al)
		{
		  if(e.empno == n)
		  {
			  e.sal = e.sal +amt;
		  }
		}
	}

}
