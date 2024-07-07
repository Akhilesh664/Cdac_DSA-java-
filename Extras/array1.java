package Extras;

public class array1 
{
	public static void main(String[] args) {
		
        int[] arr ={12,23,34,45,56};
        printaArr(arr);
	}

	private static void printaArr(int[] arr) {
		
		for(int el : arr) {
			System.out.print(el+",");
		}
		
	}

	
}
