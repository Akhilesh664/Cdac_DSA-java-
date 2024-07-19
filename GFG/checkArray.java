package GFG;

import java.util.Arrays;

public class checkArray {
	
	public static boolean check(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        
        if(n1 != n2 ){
            return false;
        }
        
        for(int i=0; i<n1; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
	
	  public static void main(String[] args) {
	        // Test cases
	        int[] arr1 = {1, 2, 3, 4};
	        int[] arr2 = {4, 3, 2, 1};
	        System.out.println(check(arr1, arr2)); // true
	  }

}
