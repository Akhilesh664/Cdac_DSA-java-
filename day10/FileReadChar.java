import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadChar 
{

	public static void main(String[] args) throws IOException 
	{
	
		
		FileReader fr = new FileReader("dac");
		
		
		
		int ch;
		
		while((ch =fr.read())!=-1 )
		{
		System.out.print((char)ch);
		
		}
		System.out.println();
		System.out.println("file read is over");
		
	}
	
	
}
