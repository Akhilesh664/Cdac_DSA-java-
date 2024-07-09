package Extras;

import java.util.Arrays;

public class ClosestThreeSum {
	
    static int threeSumClosest(int[] array, int target) {
        // code here
        
        int flag=0;
        int n=array.length;
        int result=Integer.MAX_VALUE;
         Arrays.sort(array);
         
         for(int i=0;i<n-2;++i){
             int j=i+1,k=n-1;
             
             while(j<k){
                 int sum=array[i]+array[j]+array[k];
                 
                 if(flag!=1){
                     
                     result=sum;
                     flag=1;
                 }
                 
                 if(Math.abs(sum-target)<Math.abs(result-target))
                 
                 result=sum;
                 
                 else if(Math.abs(sum-target)==Math.abs(result-target)){
                     if(sum>result)
                     result=sum;
                 }
                 if(target>sum)
                 j++;
                 
                 else
                 k--;
             }
         }
         return result;
    }
    
    public static void main(String[] args) {
        int[] array = {-1, 2, 1, -4};
        int target = -5;
        int closestSum = threeSumClosest(array, target);
        System.out.println("The closest sum to " + target + " is: " + closestSum);
    }
}
	

