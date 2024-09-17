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
		for(int i=0; i<e.length; i++)
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
			if(e[i].eno == no)
			{
				e[i].sal +=2000;				
			}
		}
	}

//	public static Emp[] deleteEmp(Emp[] e, int empIdToDelete) {
//	    // Find the index of the employee to delete
//	    int index = -1;
//	    for (int i = 0; i < e.length; i++) {
//	        if (e[i].getEmpId() == empIdToDelete) {
//	            index = i;
//	            break;
//	        }
//	    }
//
//	    // If employee not found, return the original array
//	    if (index == -1) {
//	        System.out.println("Employee with ID " + empIdToDelete + " not found.");
//	        return e;
//	    }
//
//	    // Create a new array with a smaller size
//	    Emp[] newEmpArray = new Emp[e.length - 1];
//
//	    // Copy elements to the new array, excluding the employee to delete
//	    for (int i = 0, j = 0; i < e.length; i++) {
//	        if (i != index) {
//	            newEmpArray[j++] = e[i];
//	        }
//	    }
//
//	    System.out.println("Employee with ID " + empIdToDelete + " deleted.");
//	    return newEmpArray;
//	}
	
	
}
