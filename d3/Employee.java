package d3;

public class Employee // declaring properties
{
	int empno;
	String name;
	float sal;
	
	Employee()
    {
   	 System.out.println("object 4");
   	 empno = 1004;
   	 name = "kumar";
   	 sal = 40000;
   	 
	 
   	this.dispEmp();
    }
	
	Employee(int empno, String name, float sal){ // constructor
		this.empno = empno;
		this.name = name;
		this.sal = sal;
		
		this.dispEmp();
		this.findtax();
	}

	private void dispEmp() {
		System.out.println(empno);
		System.out.println(name);
		System.out.println(sal);
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
