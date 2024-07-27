package d9;

import java.io.FileWriter;
import java.io.IOException;

public class F1 
{
	
	public static void main(String[] args) throws IOException 
	{
		FileWriter fw = new FileWriter("Dac");
		
		String str = "Welcome to java file handling";
		String str1 = "for dac";
		
		fw.write(str+"\n");
		fw.write(str1);
		
		System.out.println("file write is over");
		fw.close();
		
		
	}
	

}
