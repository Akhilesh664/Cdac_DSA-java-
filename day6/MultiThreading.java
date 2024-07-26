// @6 multithreading 
package day6;

public class MultiThreading extends Thread

{

	public void run()
	{
		for(int i =0;i<10;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) 
	{
	
		MultiThreading t = new MultiThreading();
		t.start();
		System.out.println("main ended");
		
		
	}
	
	
}
