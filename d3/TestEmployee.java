package d3;

public class TestEmployee 
{
	public static void main(String[] args) 
	{
		System.out.println("first object");
		Employee e1 = new Employee(101, "anil", 50000);
		System.out.println("Second object");
		Employee e2 = new Employee(102, "puneet", 10000);
		System.out.println("third object");
		Employee e3 = new Employee(103, "rahul", 5000);

		Employee e4 = new Employee();// for default 
		e3.findtax();
		
	}

}
