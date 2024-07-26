package day3;

import java.util.Scanner;

public class ArrayManagement 
{

	public static int[] readArray() 
	{
		int[] num = new int[4];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<num.length;i++)
		{
			num[i]= sc.nextInt();
		}
		
		return num;
	}

	public static void displayArray(int[] num) 
	{
		
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		
	}
	}

	public static void sumofArrayElement(int[] num) {
		
		int sum = 0;
		
		for(int i=0;i<num.length;i++)
		{
			sum = sum+num[i];
		
	}
		
		System.out.println("sum of array element is "+sum);
	}

	
}
