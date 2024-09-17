// #2
package day5;

public class Emp 
{
	int id;
	String name;
	Address add;
	
	
	public Emp(int id, String name, Address add)
	{
		this.id = id;
		this.name = name;
		this.add = add;
	}
	
	
	void empdetails()
	{   
		System.out.print(id+name+" "+add.city+add.state+add.pin);
	}
	
	
}
