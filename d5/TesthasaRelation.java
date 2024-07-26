package d5;

public class TesthasaRelation {
	public static void main(String[] args) 
	{
	Address add = new Address("Blr","karnataka",560038);
	
	Emp e = new Emp(1001,"shan",add);
	
	e.empdetails();
	}

}
