
public class Emp 
{

	int eno;
	String ename;
	float sal;
	public Emp(int eno, String ename, float sal) {
		
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}
	
	void dispEmp()
	{
		System.out.println(eno+ename+sal);
	}
	
}
