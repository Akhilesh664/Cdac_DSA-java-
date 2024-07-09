package GFG;

import java.util.Arrays;
import java.util.List;

public class countOfElements {
	 public int countOfElements(List<Integer> arr, int x) {
	        int count = 0;
	        for(int i = 0; i < arr.size(); i++) {
	            if(x >= arr.get(i)) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	    	countOfElements solution = new countOfElements();
	        
	        // Example test case
	        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
	        int x = 3;
	        
	        int result = solution.countOfElements(arr, x);
	        
	        System.out.println("Number of elements less than or equal to " + x + ": " + result);
	    }

}
