// #3  has relation
package day5;

public class TestHasaRelation 
{

	public static void main(String[] args) 
	{
	Address add = new Address("Blr","karnataka",560038);
	
	Emp e = new Emp(1001,"shan",add);
	
	e.empdetails();
	}
}
