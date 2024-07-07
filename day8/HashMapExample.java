// @4 Hash-Map

import java.util.HashMap;
import java.util.Map;

public class HashMapExample 
{

	public static void main(String[] args) 
	{
	
		
		HashMap<Integer, String>  hm = new HashMap<>();
		
		hm.put(1, "dac pune");
		hm.put(2, "dbda pune");
		hm.put(3, "dac blr");
		hm.put(4, "dbda blr");
		hm.put(5, "desd blr");
		
		// System.out.println(hm);
		
		
		//Iterator it = al.iteraotr()
		
//		it.hasnext()
//		it.next()
		
		for(Map.Entry m  :hm.entrySet())
		{
			System.out.println(m.getKey()+" " +m.getValue());
					
		}
			
		System.out.println("after delete");
		hm.remove(5);
		for(Map.Entry m  :hm.entrySet())
		{
			System.out.println(m.getKey()+" " +m.getValue());
					
		}
		
		System.out.println("after modify");
		
		hm.put(1, "dac blr");
		
		for(Map.Entry m  :hm.entrySet())
		{
			System.out.println(m.getKey()+" " +m.getValue());
					
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
