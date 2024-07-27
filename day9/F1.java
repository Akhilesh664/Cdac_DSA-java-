// @2 file handling
package day9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class F1
{

	public static void main(String[] args) throws IOException  
	{
	
		FileWriter fw = new FileWriter("dac"); 
		
		String str = "welcome to java file handling";
		String str1 = "for pgdac";
		fw.write(str+"\n");
		fw.write(str1);
		System.out.println("file write is over");
		fw.close();
		
		
		
		
	}
	
	
}
