package day3;

import java.util.Scanner;

public class TestArray
{
	public static void main(String[] args) 
	{
		int[] num;
		num=ArrayManagement.readArray();
		ArrayManagement.displayArray(num);
		ArrayManagement.sumofArrayElement(num);
	}
}
