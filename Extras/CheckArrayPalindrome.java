package Extras;

import java.util.Scanner;

public class CheckArrayPalindrome {
	
	public static void main(String[] args) 
	{
		// input n for making array of n elements
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt(); 
		
		// making elements and push into array
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
		// fuction call for check is it palindrome or not?		
		checkArrayPalindrome(arr, n);
		
		
		
	}

	private static void checkArrayPalindrome(int[] arr, int n) {
		Boolean b = false;
		for(int i = 0; i<n ; i++) {
			int el = arr[i];
//			for(int j = 0; j<n )
			int rev = Integer.reverse(el);
			b = true;
		}		
		
		if(b = true) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	// function for checking palindrome 
}
