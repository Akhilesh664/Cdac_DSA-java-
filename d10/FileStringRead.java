package d10;

import java.io.FileReader;
import java.io.IOException;

public class FileStringRead 
{
	public static void main(String[] args) throws IOException 
	{
		FileReader fr = new FileReader("dac");
		
		int ch;
		
		
		while((ch = fr.read()) != -1) {
			System.out.println((char)ch);
		}
		System.out.println();
		
		System.out.println("file read is over");
		
		
	}

}
