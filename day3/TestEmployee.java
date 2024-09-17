package day3;

public class TestEmployee 
{

	 public static void main(String[] args) 
	    {
		 	System.out.println("first object");
	    	Employee e1 = new Employee(1001,"shan",30000,"facult)");
	    	System.out.println("second object");
	    	Employee e2 = new Employee(1002,"raj",40000,"admin");
	    	System.out.println("third object");
	    	Employee e3 = new Employee(1003,"siju",50000,"sysadmin");
	    	
	    	Employee e4 = new Employee(); // for calling default constructor
	    	e4.dispEmp();
	    	e4.findtax();	
		}
}
