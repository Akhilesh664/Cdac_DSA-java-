package day2;

import java.util.Scanner;

public class ArrayManagement
{                                                   
	public static int[]  createArray()
	{
		int[] mark = new int[5];

		return mark;
	}
	
		
	public static int[] readArrayElement(int[] mark)
	{
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<mark.length;i++)
		{
               mark[i]=s.nextInt();
               	

		}

		return mark;	
	}


	public static void displayArrayElement(int[] mark) 
	{
		for(int m :mark)
		{
			System.out.println(m);
		}
		
	}
}
