//@2 Array-List

public class Emp 
{

	int empno;
	String name;
	int sal;
	
	public Emp(int empno, String name,int sal) 
	{
		
		this.empno = empno;
		this.name = name;
		this.sal = sal;
	}
	
	
	void dispEmp()
	{
		System.out.println(empno+name+sal);
	}
	
	
	
	
}
