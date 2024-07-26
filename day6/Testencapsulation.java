package day6;
// @5 ecapsulation

public class Testencapsulation 
{

	public static void main(String[] args) 
	{
	
		Emp e = new Emp();
		e.setEmpno(1001);
		int empno=e.getEmpno();
		System.out.println(empno);	
		
	}
	
}
