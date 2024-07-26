// 3

package day7;
public interface printable
{

	public void print();
	
	
}

class A implements printable
{
	public void print()
	{
		System.out.println("welcome to interface example");
	}
	
}

class testinteface
{
	public static void main(String[] args) 
	{
		printable p; 
		p = new A();
		p.print();
		
	}
	
	
}