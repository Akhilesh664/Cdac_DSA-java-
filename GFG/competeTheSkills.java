package GFG;

public class competeTheSkills {
	
	public static void scores(long a[], long b[]) {
        int r1 = 0;
        int r2 = 0;
		for(int i=0 ; i<a.length; i++) {
        	if(a[i] > b[i]) {
        		r1=r1+1;
        	}else if(a[i] < b[i]) {
        		r2=r2+1;
        	}	
        }
		 if (r1 < 0) {
	            r1 = 0;
	        }
	        if (r2 < 0) {
	            r2 = 0;
	        }

	        System.out.println(r1 + " " + r2);
		
    }
	
	public static void main(String[] args) 
	{
		long[] A = {4,2,7};
		long[] B = {5,6,3};
		
		scores(A,B);
		
		
	}

}
