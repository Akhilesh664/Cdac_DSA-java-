package Extras;

import java.util.Scanner;

public class GCDnumber {
    public static int gcd(int a, int b) {
        
        while(a % b != 0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return b;   
    }
    
    public static void main(String[] args) {
		int a,b;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		System.out.println(gcd(a,b));
	}
}
