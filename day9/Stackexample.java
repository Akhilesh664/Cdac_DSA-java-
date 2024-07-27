//  @4  stack
package day9;

import java.util.Stack;

public class Stackexample 
{

	public static void main(String[] args) 
	{
	
		Stack<Integer> s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println(s);
		
		for(Integer n : s)
		{
			System.out.println(n);
		}
		System.out.println("----------------------------------");
		
		int ele=s.pop();
		System.out.println(ele);
		System.out.println("----------------------------------");
		
		for(Integer n : s)
		{
			System.out.println(n);
		}
		System.out.println("----------------------------------");
		System.out.println(s.peek());
		
		System.out.println("----------------------------------");
		for(Integer n : s)
		{
			System.out.println(n);
		}
		
		s.set(2, 130);
		System.out.println("----------------------------------");
		for(Integer n : s)
		{
			System.out.println(n);
		}
		
		System.out.println("----------------------------------");
		ele =s.get(3);
		System.out.println(ele);
		
	}
}

