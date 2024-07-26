package day4;
import java.util.Scanner;


public class ArrayofEmp 
{

	public static void main(String[] args) 
	{
	    Emp[] e;
	    
		e = EmpManagement.createEmpArray();
		
		EmpManagement.displayEmpArray(e);
		
		EmpManagement.updateEmpSal(e);
		
		System.out.println("object after update");
		
		EmpManagement.displayEmpArray(e);
		
		EmpManagement.deleteEmp(e);
		
		EmpManagement.displayEmpArray(e);
			
		}
		
		
		
	}
	
	
	
