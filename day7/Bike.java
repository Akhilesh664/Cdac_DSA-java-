// 2
package day7;

abstract public class Bike
{
	abstract public void run();
}

class Honda extends Bike
{
	@Override
	public void run() 
	{
		System.out.println("honda is running");		
	}
}