package day4;

import java.util.Scanner;


public class EmpManagement 
{

	static Emp[] createEmpArray()
	{
		Emp[] e = new Emp[2];
		
		Scanner s = new Scanner(System.in);	
		
		for(int i =0;i<e.length;i++)
		{
					
			e[i] = new Emp(s.nextInt(),s.next(),s.nextFloat());
			
		}
		
		return e;
		
	}

	public static void displayEmpArray(Emp[] e) 
	{
		for(int i =0;i<e.length;i++)
		{
						
			e[i].dispEmp();
		}
		
	}

	public static void updateEmpSal(Emp[] e)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter empno to update the sal");
		int no = s.nextInt();
		
		for(int i =0;i<e.length;i++)
		{
			if(e[i].eno ==no)
			{
				e[i].sal +=2000;
				
			}
			
			
		}
		
		
		
		
	}

	public static void deleteEmp(Emp[] e) 
	{
	
		
		
		
	}
	
	
}
