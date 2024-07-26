package day4;

public class Emp 
{

	public int eno;
	String ename;
	public float sal;
	public Emp(int eno, String ename, float sal) { //constructor
		
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}
	
	public void dispEmp()
	{
		System.out.println(eno+ename+sal);
	}
	
}
