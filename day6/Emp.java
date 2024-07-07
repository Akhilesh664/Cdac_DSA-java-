// @5 ecapsulation

public class Emp 
{
   
	private int empno;

	public int getEmpno() 
	{
		return empno;
	}

	public void setEmpno(int empno) 
	{
		if(empno>=0)
		this.empno = empno;
		else
		System.out.println("invalid data");
	}
   
    
	
	
}
