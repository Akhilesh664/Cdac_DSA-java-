// 1

package day7;
public class TestAbstraction1 
{

	public static void main(String[] args) 
	{
	
		ContractEmp	 c = new ContractEmp(1001,"nathan",30000,2000,200);
		System.out.println(c.toString());
		c.dispcondetails();
		c.findsal();
		
	}
}
