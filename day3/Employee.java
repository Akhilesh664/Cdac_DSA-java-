package day3;

//import java.util.Scanner;

public class Employee   // declaring properties
{
     int empno;
     String name;
     float sal;
     String desig;

     Employee() // Default constructor
     {
    	 System.out.println("object 4");
    	 empno = 1004;
    	 name = "kumar";
    	 sal = 40000;
    	 desig ="programmer";
     }
     
     Employee(int empno,String name,float sal,String desig)  // constructor
     {
    	this.empno = empno;
    	this.name = name;
    	this.sal = sal;
    	this.desig = desig;
    	
    	this.dispEmp();
   	 	this.findtax();
     }
    
     
     
    public void dispEmp()
     {
    	 System.out.println(empno);
    	 System.out.println(name);
    	 System.out.println(sal);
    	 System.out.println(desig);
    	 
     }
    
    
    public void findtax()
    {
    	float anualSal = sal*12;
    	float tax=0;
    	if(anualSal>500000)
    	{
    		tax = anualSal*0.2f;
    	}
    	else
    		tax = anualSal*0.1f;
    	
    	System.out.println(tax);
    }
    
   
    
    
}
