package GFG;

import java.util.Scanner;

public class perfectNumber {
    static int isPerfect(int N) {
        int sum = 0;
        int org = N;
        while(N > 0){
            int temp = N%10;
            sum += fact(temp);
            N/=10;
        }
        
        if(sum != org){
            return 0;
        }else{
            return 1;
        }
        
    }
    
    static int fact(int x){
        if(x==0){
            return 1;
        }else{
            return x * fact(x-1);    
        }
    }
    
    public static void main(String[] args) {
		
    	System.out.println("Enter number for check perfect number : ");
    	Scanner s = new Scanner(System.in);
    	
    	int n = s.nextInt();
    	System.out.println(isPerfect(n));
    	
    	s.close();
	}

}
