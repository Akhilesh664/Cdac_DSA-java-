// @3 Hash-Map

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapObject 
{

	public static void main(String[] args) 
	{
	
		HashMap<Integer, Book>  hm = new HashMap<>();
		
		Book b1 = new Book(101,"Let us C",400);
		Book b2 = new Book(102,"Networking",500);
		Book b3 = new Book(103,"java Comple Reference",600);
  
		 hm.put(b1.bid, b1);
		 hm.put(b2.bid, b2);
		 hm.put(b3.bid, b3);
		 
		 for(Map.Entry m  :hm.entrySet())
			{
				System.out.print(m.getKey()+ " ");
				
				Book b=(Book) m.getValue();
				
				b.disp();
			}
		
		// for delete  
		 System.out.println("after delete");
		 
		 System.out.println("enter the bookid to delete");
			Scanner s = new Scanner(System.in);
			int id = s.nextInt();
			
			hm.remove(id);
			
		 // for printing
			for(Map.Entry m  :hm.entrySet())
			{
				System.out.print(m.getKey()+ " ");
				
				Book b=(Book) m.getValue();
				
				b.disp();
			}
			
			// for update
			System.out.println("after update");
			
			System.out.println("enter the amount to add for perticuler book");
			Scanner s1 = new Scanner(System.in);
			int id1 = s1.nextInt();
			
			for(Map.Entry m  :hm.entrySet())
			{
				int key =(int) m.getKey();
				Book b=(Book) m.getValue();
				if(key == id1)
				{
					b.price = 300;
				}
				
				
			}
			
			// for printing
			for(Map.Entry m  :hm.entrySet())
			{
				System.out.print(m.getKey()+ " ");
				
				Book b=(Book) m.getValue();
				
				b.disp();
			}
			
			
	}
	
	
	
	
	
	
}
