package d8;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample 
{
	
	public static void main(String[] args) 
	{
		ArrayList<Integer>  al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al);
		
		al.remove(1);
		
		System.out.println("after remove");
	    
	    System.out.println(al);
	    
	    al.add(1,100);
	    
	    System.out.println(al);
	    
	    al.set(0,5);
	    System.out.println(al);
	    
//	    for( Integer n :al)
//		{
//			System.out.println(n);
//		}
	    
	    //System.out.println("using iterator");
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	    
	    
	}
	

}
