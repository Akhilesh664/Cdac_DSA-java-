package day5;

class A
{
	
	void print()
	{
		System.out.println("A class print method");
	}
	
}


class B extends A
{
	
	void disp()
	{
		System.out.println("B class disp method");
	}
	
}

class C extends B
{
	
	void show()
	{
		System.out.println("C class show method");
	}
	
}

public class Testinheritance
{

	public static void main(String[] args) 
	{
	
		System.out.println("inheriance Example");
		
//		B b = new B();
//		b.disp();
//		b.print();
		
		C c = new C();
		c.print();
		c.disp();
		c.show();
		
	}
}
