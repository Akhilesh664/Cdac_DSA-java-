
public class Test 
{

	static int no;
	
	
	static void increment()
	{
		no++;
		System.out.println(no);
	}
	
	public static void main(String[] args) 
	{
	      Test t1 = new Test();
	      t1.increment();
	      Test t2 = new Test();
	      t2.increment();
	      Test t3 = new Test();
	      t3.increment();
	      
	      
	      
	}
	
	
}
