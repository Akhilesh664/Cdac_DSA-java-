// 1

package day7;

abstract public class Emp 
{

	int empno;
	String name;
	float sal;
	
	
	public Emp(int empno, String name, float sal) 
	{
		this.empno = empno;
		this.name = name;
		this.sal = sal;
	}

	
	abstract public void findsal();
	
	
	@Override
	public String toString() 
	{
		return "Emp [empno=" + empno + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
