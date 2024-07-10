package GFG;

class checkForBinary {
	  public boolean isBinary(String str) {
	        // Loop through each character in the string
	       for (int i = 0; i < str.length(); i++) {
	            // Check if the character is neither '0' nor '1'
	           if (str.charAt(i) != '0' && str.charAt(i) != '1') {
	                return false; // Return false if any character is neither '0' nor '1'
	           }
	       }
	        // If all characters are '0' or '1', return true
	        return true;
	   }
	


	    public static void main(String[] args) {
	        checkForBinary checker = new checkForBinary();
	        
	        String binaryString = "101010";
	        System.out.println("Is binary: " + checker.isBinary(binaryString)); // Should print: true

	        String nonBinaryString = "102010";
	        System.out.println("Is binary: " + checker.isBinary(nonBinaryString)); // Should print: false
	    }
	
}

