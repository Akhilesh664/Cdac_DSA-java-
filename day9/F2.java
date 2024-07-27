// @2 file handling
package day9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F2 
{

public static void main(String[] args) throws IOException 
{

	FileReader fr = new FileReader("dac");
	BufferedReader br = new BufferedReader(fr);
	
	
//	int ch = fr.read();
//	System.out.println((char)(ch));

	    String str=br.readLine();
	    String str1=br.readLine();
	    System.out.println(str);
	    System.out.println(str1);
	    fr.close();
	    
}
}
