// #1 overloading

public class methodOverloading 
{

	static void sort(int[] num)
	{
		System.out.println("int eger array sorting");
		
	}
	
	
	static void sort(String[] str)
	{
		System.out.println("String array sorting");
		
	}
	
	
	
	
}

----------------------------------------------------------------------------------------------------
// @1 Operator Overloading

package day6;
import java.util.Arrays;


// "Operator-Overloading" : A manner in which OO systems allow the same operator name or symbol to be used for multiple operations
public class methodOverloading 
{
	
	static void sort(int [] num)
	{
		System.out.println("integer array orignal");
		for (int x : num ) {
			System.out.println(x);
		}
		Arrays.sort(num);
		System.out.println("integer array sorted");
		for (int x : num ) {
			System.out.println(x);
		}
	}
	
	static void sort(String [] str)
	{
		System.out.println("string array orignal");
		for (String x : str ) {
			System.out.println(x);
		}
		Arrays.sort(str);
		System.out.println("string array sorted");
		for (String x : str ) {
			System.out.println(x);
		}
	}

}
