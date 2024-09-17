// 1

package day7;
public class ContractEmp extends Emp
{

	float msal;
   	int can;
	   
	public ContractEmp(int empno, String name, float sal,float msal,int can) {
		super(empno, name, sal);
		this.msal = msal;
		this.can = can;
			
	}

	
	public void findsal()
	{
		sal = msal + can;
		System.out.println(sal);
	}
	
	
	void dispcondetails()
	{
		System.out.println(msal+""+can);
	}
	
	
}
