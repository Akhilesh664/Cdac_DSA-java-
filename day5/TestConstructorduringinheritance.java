// #4
package day5;
class D
{
	int i;
	D()
	{
		System.out.println( "noc A");
	}
	
	D(int i)
	{   this();
		this.i = i;
		System.out.println( "pa A"+i);
	}
	
}

class E extends D
{
	int j;
	E()
	{
		System.out.println( "noc B");
	}
	
	E(int i,int j)
	{  super(i);
	  
		this.j = j;
		System.out.println( "p B" + j);
	}
	
}



public class TestConstructorduringinheritance 
{

	public static void main(String[] args) 
	{
		E e = new E(10,20);
	}
	
	
}
