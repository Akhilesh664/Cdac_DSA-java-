// @1 Array-List
package day8;

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
//	    System.out.println(al);
	    //iterating using for each
		
//		for( Integer n :al)
//		{
//			System.out.print(n);
//		}
		
		
		//iterate using iterator
		
		System.out.println("using iterator");
		Iterator it =al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

		
//		ArrayList<String>  al1 = new ArrayList<String>();
//		
//		
//		al1.add("blr");
//		al1.add("pune");
//		al1.add("Mumbai");
//		al1.add("delhi");
//		al1.add("Hyd");
//		
//		System.out.println(al1);
//		
//		
//		for( String  s :al1)
//		{
//			System.out.println(s);
//		}
//		
//		Iterator it1 =al1.iterator();
//		
//		while(it1.hasNext())
//		{
//			System.out.println(it1.next());
//		}
//		
		
		
	}
	
	
}
