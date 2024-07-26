package day6;
// @3 example overriding

 class Vehicle 
{

   void start()
	{
		System.out.println("vehicle started");
	}
	void run()
	{
		System.out.println("vehicle is running");
	}
	
	
}

class car extends Vehicle
{

	void start()
	{
		System.out.println("car started");
	}
	void run()
	{
		System.out.println("car is running");
	}
	
}

class Bike extends Vehicle
{
	
	void run()
	{
		System.out.println("Bike is running");
	}
	
	
}


class testOverriding
{
	
	public static void main(String[] args) 
	{
	
		car c = new car();
		c.run();
		c.start();
		
		Bike b = new Bike();
		b.run();
		b.start();
		
	}
	
	
}



